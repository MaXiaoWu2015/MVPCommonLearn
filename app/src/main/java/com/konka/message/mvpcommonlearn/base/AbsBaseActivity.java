package com.konka.message.mvpcommonlearn.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.aaron.library.MLog;


/**
 * Created by xiaowu on 2016-9-1.
 */
public abstract class AbsBaseActivity extends AppCompatActivity implements BaseView {
    private static String TAG_LOG=null;
    protected Context mContext=null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=this;
        //initial log
        TAG_LOG=this.getClass().getSimpleName();
        MLog.d(TAG_LOG +" onCreate");
        if (getContentViewId()!=0){
            setContentView(getContentViewId());
        }
    }

    protected abstract int getContentViewId();
}
