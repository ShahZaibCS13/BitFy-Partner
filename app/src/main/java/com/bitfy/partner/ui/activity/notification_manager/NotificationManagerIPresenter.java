package com.bitfy.partner.ui.activity.notification_manager;

import com.bitfy.partner.base.MvpPresenter;

public interface NotificationManagerIPresenter<V extends NotificationManagerIView> extends MvpPresenter<V> {
    void getNotificationManager();
}
