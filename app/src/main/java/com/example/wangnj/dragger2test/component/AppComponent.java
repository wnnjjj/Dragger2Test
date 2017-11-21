package com.example.wangnj.dragger2test.component;

import com.example.wangnj.dragger2test.module.AppModule;

import dagger.Component;

/**
 * Created by wang.nj on 2017/11/21.
 */
@Component(modules = {AppModule.class})
public interface AppComponent {
    MainActivityComponent.MainBuilder mainBuilder();
}
