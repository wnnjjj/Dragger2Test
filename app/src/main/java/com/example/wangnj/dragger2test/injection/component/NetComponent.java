package com.example.wangnj.dragger2test.injection.component;

import com.example.wangnj.dragger2test.injection.module.AppModule;
import com.example.wangnj.dragger2test.injection.module.NetModule;
import com.example.wangnj.dragger2test.ui.activity.FactoryActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wang.nj on 2017/11/20.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(FactoryActivity activity);
}
