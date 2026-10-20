package com.bitfy.partner.ui.activity.wallet_detail;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.Transaction;

import java.util.ArrayList;

public interface WalletDetailIView extends MvpView {
    void setAdapter(ArrayList<Transaction> myList);
}
