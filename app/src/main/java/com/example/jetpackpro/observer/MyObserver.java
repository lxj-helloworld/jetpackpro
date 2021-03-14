package com.example.jetpackpro.observer;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public class MyObserver implements LifecycleObserver {

    private static final String TAG = "MyObserver";

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void connectListener(){
        Log.d(TAG,"this is in connectListener");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void disConnectListener(){
        Log.d(TAG,"this is in disConnectListener");
    }


}
