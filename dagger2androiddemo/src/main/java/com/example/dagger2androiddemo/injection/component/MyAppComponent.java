package com.example.dagger2androiddemo.injection.component;

import com.example.dagger2androiddemo.base.MyApplication;
import com.example.dagger2androiddemo.injection.module.AllAppCompactActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by wang.nj on 2017/11/28.
 */
@Component(modules = {AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AllAppCompactActivityModule.class
})
public interface MyAppComponent {
    void inject(MyApplication application);
}
