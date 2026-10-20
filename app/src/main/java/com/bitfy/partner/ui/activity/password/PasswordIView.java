package com.bitfy.partner.ui.activity.password;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.ForgotResponse;
import com.bitfy.partner.data.network.model.User;

public interface PasswordIView extends MvpView {

    void onSuccess(ForgotResponse forgotResponse);

    void onSuccess(User object);

    void onError(Throwable e);
}
