package com.all.zhuzhuangtu.usegit.application;

import android.app.Application;

import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * Created by Administrator on 2017/4/25.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AutoLayoutConifg.getInstance().useDeviceSize();
    }
}
