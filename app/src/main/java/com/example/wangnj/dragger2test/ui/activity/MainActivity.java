package com.example.wangnj.dragger2test.ui.activity;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.wangnj.dragger2test.R;
import com.example.wangnj.dragger2test.common.TestApplication;
import com.example.wangnj.dragger2test.injection.component.MainActivityComponent;
import com.example.wangnj.dragger2test.entity.ActivityBean;
import com.example.wangnj.dragger2test.entity.AppBean;
import com.example.wangnj.dragger2test.injection.module.MainActivityModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    AppBean appBean;
    @Inject
    ActivityBean activityBean;
    @Inject
    Application application;
    private MainActivityComponent mainActivityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mainActivityComponent =((TestApplication)getApplication()).getAppComponent()
                                                                    .mainBuilder()
                                                                    .mainActivityModule(new MainActivityModule(new ActivityBean()))
                                                                    .build();
        mainActivityComponent.inject(this);
        Toast.makeText(application,application.hashCode()+
                                    "\n"+appBean.hashCode()+
                                    "\n"+activityBean.hashCode(),
                                    Toast.LENGTH_SHORT).show();

    }
}
