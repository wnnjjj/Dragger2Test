package com.example.wangnj.dragger2test.injection.module;

import com.example.wangnj.dragger2test.entity.ActivityBean;
import com.example.wangnj.dragger2test.injection.ActivityScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wang.nj on 2017/11/21.
 */
@Module
public class MainActivityModule {
    private ActivityBean activityBean;

    public MainActivityModule(ActivityBean activityBean) {
        this.activityBean = activityBean;
    }

    @Provides
    @ActivityScope
    public ActivityBean provideActivityBean(){
        return  this.activityBean;
    }
}
