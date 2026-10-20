package com.bitfy.partner.ui.activity.card;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.Card;

import java.util.List;

public interface CardIView extends MvpView {

    void onSuccess(Object card);

    void onSuccess(List<Card> cards);

    void onError(Throwable e);

    void onSuccessChangeCard(Object card);
}
