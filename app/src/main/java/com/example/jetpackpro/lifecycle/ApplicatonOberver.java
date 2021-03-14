package com.example.jetpackpro.lifecycle;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * 项目名称 JetPackPro
 * 创建人 xiaojinli
 * 创建时间 2020/8/5 11:46 AM
 **/
public class ApplicatonOberver implements LifecycleObserver {
    private static final String TAG = "ApplicatonOberver";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(){
        Log.d(TAG,"onCreate in ApplicatonOberver");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(){
        Log.d(TAG,"onStart in ApplicatonOberver");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(){
        Log.d(TAG,"onResume in ApplicatonOberver");
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(){
        Log.d(TAG,"onPause in ApplicatonOberver");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(){
        Log.d(TAG,"onStop in ApplicatonOberver");
    }

    /**
     * 该方法永远不会被调用，因为系统不会分发ON_DESTROY事件
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(){
        Log.d(TAG,"onDestroy in ApplicatonOberver");
    }
}
