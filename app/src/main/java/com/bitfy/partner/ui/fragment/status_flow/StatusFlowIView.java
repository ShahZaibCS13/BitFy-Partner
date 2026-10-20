package com.bitfy.partner.ui.fragment.status_flow;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.TimerResponse;

public interface StatusFlowIView extends MvpView {

    void onSuccess(Object object);

    void onWaitingTimeSuccess(TimerResponse object);

    void onError(Throwable e);
}
