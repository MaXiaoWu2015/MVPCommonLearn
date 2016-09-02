package com.konka.message.mvpcommonlearn;

import android.app.Application;

import com.example.aaron.library.MLog;

/**
 * Created by xiaowu on 2016-9-1.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.LOG_DEBUG) {
            MLog.init(true);
        }else{
            MLog.init(false);
        }
    }
}
