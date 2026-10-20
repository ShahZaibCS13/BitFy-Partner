package com.bitfy.partner.ui.bottomsheetdialog.invoice_flow;

import com.bitfy.partner.base.MvpPresenter;

import java.util.HashMap;

public interface InvoiceDialogIPresenter<V extends InvoiceDialogIView> extends MvpPresenter<V> {

    void statusUpdate(HashMap<String, Object> obj, Integer id);

}
