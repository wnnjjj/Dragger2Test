package com.example.dagger2androiddemo.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import dagger.android.AndroidInjection;

/**
 * Created by wang.nj on 2017/11/28.
 */

public class BaseActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
    }
}
