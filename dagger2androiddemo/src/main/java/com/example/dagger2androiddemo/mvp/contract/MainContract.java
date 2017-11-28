package com.example.dagger2androiddemo.mvp.contract;

/**
 * Created by wang.nj on 2017/11/28.
 */

public interface MainContract {
    public interface View{
        void showMessage(String message);
    }
    public interface Model{
        String getName();
    }
    public interface Presenter{
        void showMesage();
    }
}
