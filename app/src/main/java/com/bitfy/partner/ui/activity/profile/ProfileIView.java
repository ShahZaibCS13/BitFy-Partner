package com.bitfy.partner.ui.activity.profile;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.SettingsResponse;
import com.bitfy.partner.data.network.model.UserResponse;

public interface ProfileIView extends MvpView {

    void onSuccess(UserResponse user);

    void onSuccessUpdate(UserResponse object);
    void onSuccess(SettingsResponse response);
    void onError(Throwable e);

    void onSuccessPhoneNumber(Object object);
    void onSuccess(Object verifyEmail);
    void onVerifyPhoneNumberError(Throwable e);

    void onVerifyEmailError(Throwable e);

}
