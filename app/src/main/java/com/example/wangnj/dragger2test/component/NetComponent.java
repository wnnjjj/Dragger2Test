package com.example.wangnj.dragger2test.component;

import com.example.wangnj.dragger2test.module.AppModule;
import com.example.wangnj.dragger2test.module.NetModule;
import com.example.wangnj.dragger2test.ui.activity.FactoryActivity;

import dagger.Component;

/**
 * Created by wang.nj on 2017/11/20.
 */

@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(FactoryActivity activity);
}
