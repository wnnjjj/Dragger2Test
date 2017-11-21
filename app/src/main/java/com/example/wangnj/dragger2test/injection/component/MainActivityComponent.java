package com.example.wangnj.dragger2test.injection.component;

import com.example.wangnj.dragger2test.injection.ActivityScope;
import com.example.wangnj.dragger2test.injection.module.MainActivityModule;
import com.example.wangnj.dragger2test.ui.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Subcomponent;

/**
 * Created by wang.nj on 2017/11/21.
 */
@ActivityScope
@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
    @Subcomponent.Builder
    interface MainBuilder{
        MainBuilder mainActivityModule(MainActivityModule mainActivityModule);
        MainActivityComponent build();
    }
}
