package com.example.jetpackpro.lifecycle;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * 项目名称 JetPackPro
 * 创建人 xiaojinli
 * 创建时间 2020/8/5 10:10 AM
 **/
public class MyLocationListener implements LifecycleObserver {
    public static final String TAG = "MyLocationListener";

    //使用注解，使得在create时调用
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void initLocation(){
        Log.d(TAG,"initLocation");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void startLocation(){
        Log.d(TAG,"startLocation");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void stopLocation(){
        Log.d(TAG,"stopLocation");
    }
}
