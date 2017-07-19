package com.dhimandasgupta.ditest.main;

import com.dhimandasgupta.ditest.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by dhimandasgupta on 20/07/17.
 */

public class MainActivityPresenter implements BasePresenter {
    private MainActivityView view;

    @Inject
    MainActivityPresenter(MainActivityView mainActivityView) {
        view = mainActivityView;
    }

    public void doNothing() {
        view.doNothing();
    }
}
