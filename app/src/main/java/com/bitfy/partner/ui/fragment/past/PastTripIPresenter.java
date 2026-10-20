package com.bitfy.partner.ui.fragment.past;


import com.bitfy.partner.base.MvpPresenter;

public interface PastTripIPresenter<V extends PastTripIView> extends MvpPresenter<V> {

    void getHistory();

}
