package com.example.wangnj.dragger2test.injection.component;

import com.example.wangnj.dragger2test.injection.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wang.nj on 2017/11/21.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    MainActivityComponent.MainBuilder mainBuilder();
}
