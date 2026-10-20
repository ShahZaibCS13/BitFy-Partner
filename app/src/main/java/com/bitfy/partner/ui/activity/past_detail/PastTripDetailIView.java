package com.bitfy.partner.ui.activity.past_detail;


import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.HistoryDetail;

public interface PastTripDetailIView extends MvpView {

    void onSuccess(HistoryDetail historyDetail);
    void onError(Throwable e);
}
