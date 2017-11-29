package com.example.dagger2androiddemo.injection.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.dagger2androiddemo.entity.Student;
import com.example.dagger2androiddemo.mvp.contract.MainContract;
import com.example.dagger2androiddemo.mvp.model.MainModel;
import com.example.dagger2androiddemo.mvp.presenter.MainPresenterImp;
import com.example.dagger2androiddemo.mvp.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wang.nj on 2017/11/28.
 */
@Module
public  class MainActivitymodule {
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
