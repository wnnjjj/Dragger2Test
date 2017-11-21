package com.example.wangnj.dragger2test.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.wangnj.dragger2test.R;
import com.example.wangnj.dragger2test.injection.component.DaggerHttpFragmentComponent;
import com.example.wangnj.dragger2test.injection.component.HttpActivityComponent;
import com.example.wangnj.dragger2test.entity.RetrofitManager;
import com.example.wangnj.dragger2test.ui.activity.HttpActivity;

import javax.inject.Inject;

/**
 * Created by wang.nj on 2017/11/20.
 */

public class HttpFragment extends Fragment {

    @Inject
    RetrofitManager retrofitManager;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_http,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        HttpActivityComponent httpActivityComponent= ((HttpActivity)getActivity()).getHttpActivityComponent();
        DaggerHttpFragmentComponent.builder()
                .httpActivityComponent(httpActivityComponent)
                .build()
                .inject(this);
        Toast.makeText(getActivity(),"dependency方式："+
                            "\n"+retrofitManager.hashCode()+
                            "\n"+retrofitManager.getClient().hashCode()+
                            "\n"+retrofitManager.getClient().getCacheSize(),
                Toast.LENGTH_SHORT).show();

        httpActivityComponent.httpFragmentComponent1().inject(this);
        Toast.makeText(getActivity(),"subComponent方式1："+
                        "\n"+retrofitManager.hashCode()+
                        "\n"+retrofitManager.getClient().hashCode()+
                        "\n"+retrofitManager.getClient().getCacheSize(),
                Toast.LENGTH_SHORT).show();
    }
}
