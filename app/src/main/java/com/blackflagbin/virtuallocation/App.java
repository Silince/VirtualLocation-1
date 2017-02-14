package com.blackflagbin.virtuallocation;

import android.app.Application;
import android.widget.Button;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.navi.BaiduMapNavigation;

/**
 * Created by blackflagbin on 2017/2/8.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());
    }
}
