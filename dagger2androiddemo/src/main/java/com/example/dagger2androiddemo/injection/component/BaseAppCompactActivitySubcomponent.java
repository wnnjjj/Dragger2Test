package com.example.dagger2androiddemo.injection.component;

import android.app.Activity;

import com.example.dagger2androiddemo.base.BaseAppCompactAvtivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by wang.nj on 2017/11/29.
 */
@Subcomponent(modules = AndroidInjectionModule.class)
public interface BaseAppCompactActivitySubcomponent extends AndroidInjector<BaseAppCompactAvtivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseAppCompactAvtivity>{}
}
