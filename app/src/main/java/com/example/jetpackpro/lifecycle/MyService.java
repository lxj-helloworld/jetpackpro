package com.example.jetpackpro.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.lifecycle.LifecycleService;

public class MyService extends LifecycleService {
    private static final String TAG = "MyService";
    private MyServiceObserver myServiceObserver;
    public MyService(){
        myServiceObserver = new MyServiceObserver();
        getLifecycle().addObserver(myServiceObserver);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG,"onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
}
