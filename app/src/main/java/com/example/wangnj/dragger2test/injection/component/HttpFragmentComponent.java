package com.example.wangnj.dragger2test.injection.component;

import com.example.wangnj.dragger2test.injection.FragmentScope;
import com.example.wangnj.dragger2test.ui.fragment.HttpFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wang.nj on 2017/11/20.
 */
@FragmentScope
@Component(dependencies = {HttpActivityComponent.class})
public interface HttpFragmentComponent {
        void inject(HttpFragment fragment);
}
