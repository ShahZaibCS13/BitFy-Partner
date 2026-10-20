package com.bitfy.partner.ui.activity.sociallogin;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.Token;

public interface SocialLoginIView extends MvpView {

    void onSuccess(Token token);
    void onError(Throwable e);
}
