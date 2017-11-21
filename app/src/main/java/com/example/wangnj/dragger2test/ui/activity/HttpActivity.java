package com.example.wangnj.dragger2test.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.wangnj.dragger2test.R;
import com.example.wangnj.dragger2test.component.DaggerHttpActivityComponent;
import com.example.wangnj.dragger2test.component.HttpActivityComponent;
import com.example.wangnj.dragger2test.entity.OkHttpClient;
import com.example.wangnj.dragger2test.entity.RetrofitManager;
import com.example.wangnj.dragger2test.module.HttpActivityModule;
import com.example.wangnj.dragger2test.ui.fragment.HttpFragment;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by wang.nj on 2017/11/20.
 */

public class HttpActivity extends AppCompatActivity {
    @Inject@Named("cached")
    OkHttpClient client;
    @Inject
    RetrofitManager retrofitManager;
    private HttpActivityComponent httpActivityComponent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_http);
        initView();
    }

    private void initView() {
        httpActivityComponent = DaggerHttpActivityComponent.builder()
                .httpActivityModule(new HttpActivityModule(100))
                .build();

        httpActivityComponent.inject(this);

        Toast.makeText(this,client.hashCode()+
                "\n"+client.getCacheSize()+
                "\n"+retrofitManager.getClient().hashCode()+
                "\n"+retrofitManager.getClient().getCacheSize(),
                Toast.LENGTH_SHORT
        ).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frg_http,new HttpFragment())
                .commit();
    }

    public HttpActivityComponent getHttpActivityComponent() {
        return httpActivityComponent;
    }
}
