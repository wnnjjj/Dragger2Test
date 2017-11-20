package com.example.wangnj.dragger2test.component;

import com.example.wangnj.dragger2test.ui.FactoryActivity;

import dagger.Component;

/**
 * Created by wang.nj on 2017/11/20.
 */

@Component
public interface FactoryActivityComponent {
    void inject(FactoryActivity activity);
}
