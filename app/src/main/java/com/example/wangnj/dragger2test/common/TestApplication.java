package com.example.wangnj.dragger2test.common;

import android.app.Application;

import com.example.wangnj.dragger2test.injection.component.AppComponent;
import com.example.wangnj.dragger2test.injection.component.DaggerAppComponent;
import com.example.wangnj.dragger2test.injection.module.AppModule;

/**
 * Created by wang.nj on 2017/11/20.
 */

public class TestApplication extends Application {

    private AppComponent  appComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        initComponent();
    }

    private void initComponent() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return this.appComponent;
    }
}
