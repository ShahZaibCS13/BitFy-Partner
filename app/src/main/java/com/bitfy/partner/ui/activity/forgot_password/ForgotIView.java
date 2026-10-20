package com.bitfy.partner.ui.activity.forgot_password;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.ForgotResponse;

public interface ForgotIView extends MvpView {

    void onSuccess(ForgotResponse forgotResponse);
    void onError(Throwable e);
}
