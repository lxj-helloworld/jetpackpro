package com.example.jetpackpro.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.jetpackpro.R;

public class LocationActivity extends AppCompatActivity {

    private static final String TAG = "LocationActivity";

    public MyLocationListener myLocationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        //初始化定位对象
        myLocationListener = new MyLocationListener();
        getLifecycle().addObserver(myLocationListener);

        Log.d(TAG,"onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    ///启动Service
    public void startService(View view) {
        Intent intent = new Intent(LocationActivity.this,MyService.class);
        startService(intent);
    }

    //关闭Service
    public void stopService(View view) {
        Intent intent = new Intent(LocationActivity.this,MyService.class);
        stopService(intent);
    }
}
