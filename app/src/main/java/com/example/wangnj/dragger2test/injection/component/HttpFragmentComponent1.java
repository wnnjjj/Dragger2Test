package com.example.wangnj.dragger2test.injection.component;

import com.example.wangnj.dragger2test.injection.FragmentScope;
import com.example.wangnj.dragger2test.ui.fragment.HttpFragment;

import javax.inject.Singleton;

import dagger.Subcomponent;

/**
 * Created by wang.nj on 2017/11/20.
 */
@FragmentScope
@Subcomponent
public interface HttpFragmentComponent1 {
    void inject(HttpFragment fragment);
}
