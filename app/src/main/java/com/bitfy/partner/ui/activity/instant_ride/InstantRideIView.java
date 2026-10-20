package com.bitfy.partner.ui.activity.instant_ride;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.EstimateFare;
import com.bitfy.partner.data.network.model.TripResponse;

public interface InstantRideIView extends MvpView {

    void onSuccess(EstimateFare estimateFare);

    void onSuccess(TripResponse response);

    void onError(Throwable e);

}
