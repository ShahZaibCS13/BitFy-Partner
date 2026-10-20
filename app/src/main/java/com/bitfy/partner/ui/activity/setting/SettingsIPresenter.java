package com.bitfy.partner.ui.activity.setting;

import com.bitfy.partner.base.MvpPresenter;

public interface SettingsIPresenter<V extends SettingsIView> extends MvpPresenter<V> {
    void changeLanguage(String languageID);
}
