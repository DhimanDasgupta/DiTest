package com.dhimandasgupta.ditest.second;

import com.dhimandasgupta.ditest.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by dhimandasgupta on 20/07/17.
 */

public class SecondActivityPresenter implements BasePresenter {
    private SecondActivityView view;

    @Inject
    public SecondActivityPresenter(SecondActivityView secondActivityView) {
        view = secondActivityView;
    }

    public void showText(String text) {
        view.showText(text);
    }
}
