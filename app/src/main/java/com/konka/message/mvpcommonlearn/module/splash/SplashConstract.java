package com.konka.message.mvpcommonlearn.module.splash;


import com.konka.message.mvpcommonlearn.base.BasePresenter;
import com.konka.message.mvpcommonlearn.base.BaseView;

/**
 * Created by xiaowu on 2016-9-1.
 */
public interface SplashConstract {

    interface  Presenter extends BasePresenter<View>{
        void initData();
    }


    interface View extends BaseView{
        void toMainActivity();
    }
}
