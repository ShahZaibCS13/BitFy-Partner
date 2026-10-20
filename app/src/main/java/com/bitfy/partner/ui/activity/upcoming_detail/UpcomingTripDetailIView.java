package com.bitfy.partner.ui.activity.upcoming_detail;


import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.HistoryDetail;

public interface UpcomingTripDetailIView extends MvpView {

    void onSuccess(HistoryDetail historyDetail);
    void onError(Throwable e);
}
