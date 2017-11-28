package com.example.dagger2androiddemo.injection.module;

import android.app.Activity;

import com.example.dagger2androiddemo.injection.component.SecondActivitySubcomponenet;
import com.example.dagger2androiddemo.mvp.ui.SecondActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by wang.nj on 2017/11/28.
 */
@Module(subcomponents = SecondActivitySubcomponenet.class)
public abstract class SecondActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(SecondActivity.class)
    abstract AndroidInjector.Factory<?extends Activity>bindSecondActivityInjectorFactory(SecondActivitySubcomponenet.Builder builder);
}
