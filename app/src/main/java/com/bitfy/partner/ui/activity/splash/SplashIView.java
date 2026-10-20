package com.bitfy.partner.ui.activity.splash;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.CheckVersion;

public interface SplashIView extends MvpView {

    void verifyAppInstalled();

    void onSuccess(Object user);

    void onSuccess(CheckVersion user);

    void onError(Throwable e);

    void onCheckVersionError(Throwable e);
}
