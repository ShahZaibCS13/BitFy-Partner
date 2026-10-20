package com.bitfy.partner.ui.activity.change_password;

import com.bitfy.partner.base.MvpView;

public interface ChangePasswordIView extends MvpView {


    void onSuccess(Object object);
    void onError(Throwable e);
}
