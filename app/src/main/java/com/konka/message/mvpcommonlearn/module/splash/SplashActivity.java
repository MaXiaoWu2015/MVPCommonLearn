package com.konka.message.mvpcommonlearn.module.splash;

import android.content.Intent;
import android.os.Bundle;

import com.konka.message.mvpcommonlearn.R;
import com.konka.message.mvpcommonlearn.base.AbsBaseActivity;
import com.konka.message.mvpcommonlearn.module.main.MainActivity;

public class SplashActivity extends AbsBaseActivity implements SplashConstract.View{


    SplashPresenter mSplashPresenter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_splash;
    }

    @Override
    public void showMessage(String msg) {

    }

    @Override
    public void showErrorMessag(String erroMsg) {

    }

    @Override
    public void showProgress(String msg) {

    }

    @Override
    public void showProgress(String msg, int progress) {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void close() {

    }

    @Override
    public void toMainActivity() {
        Intent intent=new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
