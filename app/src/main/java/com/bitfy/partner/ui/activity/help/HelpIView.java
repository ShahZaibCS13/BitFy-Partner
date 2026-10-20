package com.bitfy.partner.ui.activity.help;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.Help;

public interface HelpIView extends MvpView {

    void onSuccess(Help object);

    void onError(Throwable e);
}
