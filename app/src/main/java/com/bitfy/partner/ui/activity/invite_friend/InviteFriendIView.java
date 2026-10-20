package com.bitfy.partner.ui.activity.invite_friend;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.UserResponse;

public interface InviteFriendIView extends MvpView {

    void onSuccess(UserResponse response);
    void onError(Throwable e);

}
