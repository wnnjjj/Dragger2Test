package com.example.wangnj.dragger2test.component;

import com.example.wangnj.dragger2test.ui.fragment.HttpFragment;

import dagger.Subcomponent;

/**
 * Created by wang.nj on 2017/11/20.
 */
@Subcomponent
public interface HttpFragmentComponent1 {
    void inject(HttpFragment fragment);
}
