package com.example.dagger2androiddemo.injection.component;

import com.example.dagger2androiddemo.mvp.ui.SecondActivity;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by wang.nj on 2017/11/28.
 */
@Subcomponent(modules = {AndroidInjectionModule.class,SecondActivitySubcomponenet.SubModule.class})
public interface SecondActivitySubcomponenet extends AndroidInjector<SecondActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SecondActivity>{}
    @Module
    class SubModule{
        @Provides
        String provideName(){
            return SecondActivity.class.getName();
        }
    }
}
