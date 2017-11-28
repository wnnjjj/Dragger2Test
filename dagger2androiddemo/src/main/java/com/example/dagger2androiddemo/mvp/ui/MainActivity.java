package com.example.dagger2androiddemo.mvp.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dagger2androiddemo.R;
import com.example.dagger2androiddemo.base.BaseAppCompactAvtivity;
import com.example.dagger2androiddemo.entity.Student;
import com.example.dagger2androiddemo.mvp.contract.MainContract;
import com.example.dagger2androiddemo.mvp.presenter.MainPresenterImp;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseAppCompactAvtivity implements MainContract.View {
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.button2)
    Button button2;
    @Inject  String className;
    @Inject  SharedPreferences sharedPreferences;
    @Inject  Student student;
    @Inject  MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        textView.setText(className.toString()+"\n"
        +sharedPreferences.toString()+"\n"
        +student.toString()+"\n"
        +presenter.toString());
    }

    @OnClick({R.id.button, R.id.button2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button:
                presenter.showMesage();
                break;
            case R.id.button2:
                Intent intent = new Intent(this,SecondActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}
