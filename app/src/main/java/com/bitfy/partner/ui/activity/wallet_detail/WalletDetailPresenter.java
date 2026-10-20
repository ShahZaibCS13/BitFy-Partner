package com.bitfy.partner.ui.activity.wallet_detail;

import com.bitfy.partner.base.BasePresenter;
import com.bitfy.partner.data.network.model.Transaction;

import java.util.ArrayList;

public class WalletDetailPresenter<V extends WalletDetailIView> extends BasePresenter<V> implements WalletDetailIPresenter<V> {
    @Override
    public void setAdapter(ArrayList<Transaction> myList) {
        getMvpView().setAdapter(myList);
    }
}
