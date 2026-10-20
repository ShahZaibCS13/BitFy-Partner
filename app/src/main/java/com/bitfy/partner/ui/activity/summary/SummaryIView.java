package com.bitfy.partner.ui.activity.summary;


import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.Summary;

public interface SummaryIView extends MvpView {

    void onSuccess(Summary object);

    void onError(Throwable e);
}
