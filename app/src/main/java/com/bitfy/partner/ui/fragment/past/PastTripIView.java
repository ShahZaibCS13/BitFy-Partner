package com.bitfy.partner.ui.fragment.past;


import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.HistoryList;

import java.util.List;

public interface PastTripIView extends MvpView {

    void onSuccess(List<HistoryList> historyList);
    void onError(Throwable e);
}
