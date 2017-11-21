package com.example.wangnj.dragger2test.component;

import com.example.wangnj.dragger2test.ui.fragment.HttpFragment;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by wang.nj on 2017/11/20.
 */
@Component(dependencies = {HttpActivityComponent.class})
public interface HttpFragmentComponent {
        void inject(HttpFragment fragment);
}
