package com.bitfy.partner.ui.activity.earnings;


import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.EarningsList;

public interface EarningsIView extends MvpView {

    void onSuccess(EarningsList earningsLists);

    void onError(Throwable e);
}
