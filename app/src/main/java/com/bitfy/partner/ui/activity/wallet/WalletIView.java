package com.bitfy.partner.ui.activity.wallet;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.WalletMoneyAddedResponse;
import com.bitfy.partner.data.network.model.WalletResponse;

public interface WalletIView extends MvpView {

    void onSuccess(WalletResponse response);

    void onSuccess(WalletMoneyAddedResponse response);

    void onError(Throwable e);
}
