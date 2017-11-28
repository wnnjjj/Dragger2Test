package com.example.dagger2androiddemo.mvp.presenter;

import com.example.dagger2androiddemo.mvp.contract.MainContract;

import javax.inject.Inject;

/**
 * Created by wang.nj on 2017/11/28.
 */

public class MainPresenterImp implements MainContract.Presenter {
    private MainContract.View view;
    private MainContract.Model model;
    public MainPresenterImp(MainContract.View view, MainContract.Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void showMesage() {
        view.showMessage(model.getName());
    }
}
