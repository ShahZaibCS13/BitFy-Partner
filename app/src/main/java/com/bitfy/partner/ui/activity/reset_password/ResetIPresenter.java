package com.bitfy.partner.ui.activity.reset_password;

import com.bitfy.partner.base.MvpPresenter;

import java.util.HashMap;

public interface ResetIPresenter<V extends ResetIView> extends MvpPresenter<V> {

    void reset(HashMap<String, Object> obj);

}
