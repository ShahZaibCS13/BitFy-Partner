package com.bitfy.partner.ui.activity.summary;


import com.bitfy.partner.base.MvpPresenter;

public interface SummaryIPresenter<V extends SummaryIView> extends MvpPresenter<V> {

    void getSummary();
}
