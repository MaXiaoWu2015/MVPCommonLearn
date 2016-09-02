package com.konka.message.mvpcommonlearn.base;

/**
 * Created by xiaowu on 2016-9-1.
 */
public interface BasePresenter<T extends BaseView> {
    void attachView(T view);
    void detachView();
}
