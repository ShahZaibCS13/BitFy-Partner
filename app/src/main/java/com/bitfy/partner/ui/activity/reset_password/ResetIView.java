package com.bitfy.partner.ui.activity.reset_password;

import com.bitfy.partner.base.MvpView;

public interface ResetIView extends MvpView {

    void onSuccess(Object object);
    void onError(Throwable e);
}
