package com.bitfy.partner.ui.fragment.upcoming;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.HistoryList;

import java.util.List;

public interface UpcomingTripIView extends MvpView {

    void onSuccess(List<HistoryList> historyList);
    void onError(Throwable e);
}
