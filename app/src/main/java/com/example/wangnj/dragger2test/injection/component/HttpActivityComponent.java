package com.example.wangnj.dragger2test.injection.component;

import com.example.wangnj.dragger2test.entity.RetrofitManager;
import com.example.wangnj.dragger2test.injection.module.HttpActivityModule;
import com.example.wangnj.dragger2test.ui.activity.HttpActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wang.nj on 2017/11/20.
 */
@Singleton
@Component(modules = {HttpActivityModule.class})
public interface HttpActivityComponent {
    void inject(HttpActivity activity);
    RetrofitManager provideRetrofitManager();
    HttpFragmentComponent1 httpFragmentComponent1();
}
