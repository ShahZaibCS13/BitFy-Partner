package com.bitfy.partner.data.network;

import android.util.Log;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.bitfy.partner.BuildConfig;
import com.bitfy.partner.MvpApplication;
import com.bitfy.partner.common.SharedHelper;
import com.bitfy.partner.common.Constants;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import androidx.annotation.NonNull;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
    private static Retrofit retrofit = null;

    public static ApiInterface getAPIClient() {
        if (retrofit == null) {
            Gson gson = new GsonBuilder().setLenient().create();
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BuildConfig.BASE_URL)
                    .client(getHttpClient())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit.create(ApiInterface.class);
    }

    private static OkHttpClient getHttpClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient().newBuilder()
                .cache(new Cache(MvpApplication.getInstance().getCacheDir(), 10 * 1024 * 1024)) // 10 MB
                .connectTimeout(10, TimeUnit.MINUTES)
                .addNetworkInterceptor(new AddHeaderInterceptor())
                .addNetworkInterceptor(new StethoInterceptor())
                .readTimeout(10, TimeUnit.MINUTES)
                .writeTimeout(10, TimeUnit.MINUTES)
                .addInterceptor(interceptor)
                .hostnameVerifier(new HostnameVerifier() {
                    @Override
                    public boolean verify(String hostname, SSLSession session) {

                        HostnameVerifier hv =
                                HttpsURLConnection.getDefaultHostnameVerifier();
                        return hv.verify(BuildConfig.HOST_NAME, session);
                    }
                })
                .build();
    }

    public static Retrofit getFcmRetrofit() {
        OkHttpClient client = getHttpClient();
        return new Retrofit.Builder()
                .baseUrl("https://fcm.googleapis.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }

    private static class AddHeaderInterceptor implements Interceptor {
        @Override
        public Response intercept(@NonNull Chain chain) throws IOException {
            Request.Builder builder = chain.request().newBuilder();
            builder.addHeader("X-Requested-With", "XMLHttpRequest");
            builder.addHeader("Authorization", "Bearer " + SharedHelper.getKey(MvpApplication.getInstance(), Constants.SharedPref.ACCESS_TOKEN));
            Log.d("TTT access_token", SharedHelper.getKey(MvpApplication.getInstance(), Constants.SharedPref.ACCESS_TOKEN));
            return chain.proceed(builder.build());
        }
    }

}
