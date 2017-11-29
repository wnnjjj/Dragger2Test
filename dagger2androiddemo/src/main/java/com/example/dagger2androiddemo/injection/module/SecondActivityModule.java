package com.example.dagger2androiddemo.injection.module;

import com.example.dagger2androiddemo.mvp.ui.SecondActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wang.nj on 2017/11/28.
 */
@Module
public  class SecondActivityModule {
    @Provides
    String provideName(){
        return SecondActivity.class.getName();
    }
}
