package com.example.wangnj.dragger2test.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.wangnj.dragger2test.R;
import com.example.wangnj.dragger2test.component.DaggerFactoryActivityComponent;
import com.example.wangnj.dragger2test.entity.Factory;
import com.example.wangnj.dragger2test.entity.Product;

import javax.inject.Inject;

import dagger.internal.DaggerCollections;

/**
 * Created by wang.nj on 2017/11/20.
 */

public class FactoryActivity extends AppCompatActivity {

    @Inject
    Product product;
    @Inject
    Factory factory;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        initView();
    }

    private void initView() {
        DaggerFactoryActivityComponent.create().inject(this);
        Toast.makeText(this,product.NO+""+"\n",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,factory.product.NO+"",Toast.LENGTH_SHORT).show();
    }
}
