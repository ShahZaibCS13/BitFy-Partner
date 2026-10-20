package com.bitfy.partner.ui.activity.add_card;

import com.bitfy.partner.base.MvpView;

public interface AddCardIView extends MvpView {

    void onSuccess(Object card);

    void onError(Throwable e);
}
