package com.bitfy.partner.ui.activity.earnings;

import com.bitfy.partner.base.BasePresenter;
import com.bitfy.partner.data.network.APIClient;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class EarningsPresenter<V extends EarningsIView> extends BasePresenter<V> implements EarningsIPresenter<V> {
    @Override
    public void getEarnings() {
        getCompositeDisposable().add(
                APIClient
                        .getAPIClient()
                        .getEarnings()
                        .subscribeOn(Schedulers.computation())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(
                                trendsResponse -> getMvpView().onSuccess(trendsResponse),
                                throwable -> getMvpView().onError(throwable)
                        )
        );
    }
}
