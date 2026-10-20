package com.bitfy.partner.ui.activity.past_detail;


import com.bitfy.partner.base.MvpPresenter;

public interface PastTripDetailIPresenter<V extends PastTripDetailIView> extends MvpPresenter<V> {

    void getPastTripDetail(String request_id);
}
