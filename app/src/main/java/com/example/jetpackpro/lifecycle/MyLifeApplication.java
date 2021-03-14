package com.example.jetpackpro.lifecycle;

import android.app.Application;
import android.content.Context;

import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.navigation.ui.AppBarConfiguration;

/**
 * 项目名称 JetPackPro
 * 创建人 xiaojinli
 * 创建时间 2020/8/5 11:46 AM
 **/
public class MyLifeApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ProcessLifecycleOwner.get().getLifecycle().addObserver(new ApplicatonOberver());
    }


    public Context getContext(){
        return getBaseContext();
    }
}
