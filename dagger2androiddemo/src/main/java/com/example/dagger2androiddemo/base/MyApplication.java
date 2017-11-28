package com.example.dagger2androiddemo.base;

import android.app.Activity;
import android.app.Application;

import com.example.dagger2androiddemo.injection.component.DaggerMyAppComponent;

import javax.inject.Inject;

import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by wang.nj on 2017/11/28.
 */

public class MyApplication extends Application implements HasActivityInjector{
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;
    @Override
    public void onCreate() {
        super.onCreate();
        DaggerMyAppComponent.create().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
