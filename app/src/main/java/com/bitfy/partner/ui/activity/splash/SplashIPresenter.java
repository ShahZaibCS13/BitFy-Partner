package com.bitfy.partner.ui.activity.splash;

import com.bitfy.partner.base.MvpPresenter;

import java.util.HashMap;

public interface SplashIPresenter<V extends SplashIView> extends MvpPresenter<V> {

    void handlerCall();

    void getPlaces();

    void checkVersion(HashMap<String, Object> map);

}
