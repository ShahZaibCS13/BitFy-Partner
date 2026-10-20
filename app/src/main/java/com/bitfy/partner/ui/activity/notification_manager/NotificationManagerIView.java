package com.bitfy.partner.ui.activity.notification_manager;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.NotificationManager;

import java.util.List;

public interface NotificationManagerIView extends MvpView {

    void onSuccess(List<NotificationManager> managers);

    void onError(Throwable e);

}