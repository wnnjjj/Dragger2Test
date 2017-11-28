package com.example.dagger2androiddemo.mvp.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.example.dagger2androiddemo.R;
import com.example.dagger2androiddemo.base.BaseAppCompactAvtivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by wang.nj on 2017/11/28.
 */

public class SecondActivity extends BaseAppCompactAvtivity {
    @Inject
    String className;
    @BindView(R.id.textView2)
    TextView textView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        textView2.setText(className.toString());
    }
}
