package com.bitfy.partner.ui.activity.document;

import com.bitfy.partner.base.MvpView;
import com.bitfy.partner.data.network.model.DriverDocumentResponse;

public interface DocumentIView extends MvpView {

    void onSuccess(DriverDocumentResponse response);

    void onDocumentSuccess(DriverDocumentResponse response);

    void onError(Throwable e);

    void onSuccessLogout(Object object);

}
