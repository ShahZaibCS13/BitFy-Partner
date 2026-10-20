package com.bitfy.partner.ui.bottomsheetdialog.invoice_flow;

import com.bitfy.partner.base.MvpView;

public interface InvoiceDialogIView extends MvpView {

    void onSuccess(Object object);
    void onError(Throwable e);
}
