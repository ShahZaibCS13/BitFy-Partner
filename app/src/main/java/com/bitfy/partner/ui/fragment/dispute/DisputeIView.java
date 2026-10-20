package com.bitfy.partner.ui.fragment.dispute;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.DisputeResponse;

import java.util.List;

public interface DisputeIView extends MvpView {

    void onSuccessDispute(List<DisputeResponse> responseList);

    void onSuccess(Object object);

    void onError(Throwable e);
}
