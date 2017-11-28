package com.example.dagger2androiddemo.injection.module;

import android.app.Activity;

import com.example.dagger2androiddemo.injection.component.MainActivitySubcomponent;
import com.example.dagger2androiddemo.mvp.ui.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by wang.nj on 2017/11/28.
 */
@Module(subcomponents = MainActivitySubcomponent.class)
public abstract class MainActivitymodule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<?extends Activity>bindMainActivityInjectorFactory(MainActivitySubcomponent.Builder builder);
}
