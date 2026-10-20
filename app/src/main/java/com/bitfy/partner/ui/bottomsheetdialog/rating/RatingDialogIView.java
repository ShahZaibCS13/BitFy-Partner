package com.bitfy.partner.ui.bottomsheetdialog.rating;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.Rating;

public interface RatingDialogIView extends MvpView {

    void onSuccess(Rating rating);
    void onError(Throwable e);
}
