package com.example.wangnj.dragger2test.injection.component;

import com.example.wangnj.dragger2test.ui.activity.FactoryActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wang.nj on 2017/11/20.
 */
@Singleton
@Component
public interface FactoryActivityComponent {
    void inject(FactoryActivity activity);
}
