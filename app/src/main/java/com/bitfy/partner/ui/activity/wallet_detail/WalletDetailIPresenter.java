package com.bitfy.partner.ui.activity.wallet_detail;

import com.bitfy.partner.base.MvpPresenter;
import com.bitfy.partner.data.network.model.Transaction;

import java.util.ArrayList;

public interface WalletDetailIPresenter<V extends WalletDetailIView> extends MvpPresenter<V> {
    void setAdapter(ArrayList<Transaction> myList);
}
