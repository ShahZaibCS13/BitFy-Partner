package com.bitfy.partner.ui.fragment.upcoming;


import com.bitfy.partner.base.MvpPresenter;

public interface UpcomingTripIPresenter<V extends UpcomingTripIView> extends MvpPresenter<V> {

    void getUpcoming();

}
