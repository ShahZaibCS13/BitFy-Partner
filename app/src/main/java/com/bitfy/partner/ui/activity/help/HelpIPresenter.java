package com.bitfy.partner.ui.activity.help;


import com.bitfy.partner.base.MvpPresenter;

public interface HelpIPresenter<V extends HelpIView> extends MvpPresenter<V> {

    void getHelp();
}
