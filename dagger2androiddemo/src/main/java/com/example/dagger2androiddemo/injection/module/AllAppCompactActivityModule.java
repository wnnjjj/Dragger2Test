package com.example.dagger2androiddemo.injection.module;

import com.example.dagger2androiddemo.injection.component.BaseAppCompactActivitySubcomponent;
import com.example.dagger2androiddemo.mvp.ui.MainActivity;
import com.example.dagger2androiddemo.mvp.ui.SecondActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by wang.nj on 2017/11/29.
 */
@Module(subcomponents = BaseAppCompactActivitySubcomponent.class)
public abstract class AllAppCompactActivityModule {
    @ContributesAndroidInjector(modules = MainActivitymodule.class)
    abstract MainActivity contributeMainActivityInjector();

    @ContributesAndroidInjector(modules = SecondActivityModule.class)
    abstract SecondActivity contributeSecondActivityInjector();
}
