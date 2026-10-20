package com.bitfy.partner.ui.activity.earnings;


import com.bitfy.partner.base.MvpPresenter;

public interface EarningsIPresenter<V extends EarningsIView> extends MvpPresenter<V> {

    void getEarnings();
}
