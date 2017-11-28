package com.example.dagger2androiddemo.mvp.model;

import com.example.dagger2androiddemo.mvp.contract.MainContract;

import javax.inject.Inject;

/**
 * Created by wang.nj on 2017/11/28.
 */

public class MainModel implements MainContract.Model {

    @Override
    public String getName() {
        return "小芮，miss you";
    }
}
