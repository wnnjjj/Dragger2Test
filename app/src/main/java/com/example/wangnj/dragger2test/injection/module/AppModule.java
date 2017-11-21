package com.example.wangnj.dragger2test.injection.module;

import android.app.Application;

import com.example.wangnj.dragger2test.entity.AppBean;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wang.nj on 2017/11/20.
 */
@Module
public class AppModule {
    private Application mApplication;

    public AppModule(Application application){
        this.mApplication = application;
    }

    @Provides
    @Singleton
    public Application provideApplication(){
        return mApplication;
    }

    @Provides
    @Singleton
    public AppBean provideAppBean(){
        return  new AppBean();
    }
}
