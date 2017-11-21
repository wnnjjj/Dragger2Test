package com.example.wangnj.dragger2test.component;

import com.example.wangnj.dragger2test.module.MainActivityModule;
import com.example.wangnj.dragger2test.ui.activity.MainActivity;

import dagger.Subcomponent;

/**
 * Created by wang.nj on 2017/11/21.
 */
@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
    @Subcomponent.Builder
    interface MainBuilder{
        MainBuilder mainActivityModule(MainActivityModule mainActivityModule);
        MainActivityComponent build();
    }
}
