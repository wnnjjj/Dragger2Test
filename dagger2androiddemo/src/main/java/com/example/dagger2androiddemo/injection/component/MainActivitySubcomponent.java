package com.example.dagger2androiddemo.injection.component;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.dagger2androiddemo.entity.Student;
import com.example.dagger2androiddemo.mvp.contract.MainContract;
import com.example.dagger2androiddemo.mvp.model.MainModel;
import com.example.dagger2androiddemo.mvp.presenter.MainPresenterImp;
import com.example.dagger2androiddemo.mvp.ui.MainActivity;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by wang.nj on 2017/11/28.
 */
@Subcomponent(modules = {AndroidInjectionModule.class,MainActivitySubcomponent.SubModule.class})
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{}
    @Module
    class SubModule{
        @Provides
        String provideName(){
            return MainActivity.class.getName();
        }
        @Provides
        Student provideStudent(){
            return new Student();
        }
        @Provides
        SharedPreferences provideSp(MainActivity activity){
            return activity.getSharedPreferences("def", Context.MODE_PRIVATE);
        }
        @Provides
        MainContract.Model provideMainmodel(){
            return  new MainModel();
        }
        @Provides
        MainContract.Presenter provideMainPresentImp(MainActivity activity,MainContract.Model model){
            return new MainPresenterImp(activity,model);
        }
    }
}
