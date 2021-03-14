package com.example.jetpackpro.lifecycle;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * 项目名称 JetPackPro
 * 创建人 xiaojinli
 * 创建时间 2020/8/5 11:17 AM
 **/
public class MyServiceObserver implements LifecycleObserver {
    private static final String TAG = "MyServiceObserver";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void startService(){
        Log.d(TAG,"在MyServiceObserver中监听到Service启动 ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void stopService(){
        Log.d(TAG,"在MyServiceObserver中监听到Service停止 ");
    }
}
