package com.konka.message.mvpcommonlearn.base;

/**
 * Created by xiaowu on 2016-9-1.
 */
//loading、加载错误、网络加载错误
public interface BaseView<T> {
    void showMessage(String msg);
    void showErrorMessag(String erroMsg);
    void showProgress(String msg);
    void showProgress(String msg,int progress);
    void hideProgress();
    void close();

}
