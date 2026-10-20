package com.bitfy.partner.ui.activity.request_money;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.RequestDataResponse;

public interface RequestMoneyIView extends MvpView {

    void onSuccess(RequestDataResponse response);
    void onSuccess(Object response);
    void onError(Throwable e);

}
