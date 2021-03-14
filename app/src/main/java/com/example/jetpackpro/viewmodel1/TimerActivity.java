package com.example.jetpackpro.viewmodel1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.example.jetpackpro.R;

public class TimerActivity extends AppCompatActivity {
    private static final String TAG = "TimerActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        initComponent();
    }


    private void initComponent() {
        //通过ViewModelProvider得到ViewModel
        TimerViewModel timerViewModel = new ViewModelProvider(this).get(TimerViewModel.class);
        //得到ViewModel中的LiveData
        final MutableLiveData<Integer> liveData = timerViewModel.getMutableLiveData();
        //通过LiveData中的observer观察ViewModel中数据的变化
        liveData.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                Log.d(TAG,"当前值为： " + integer);
            }
        });
        //更新数据
        timerViewModel.changeValue();
    }
}
