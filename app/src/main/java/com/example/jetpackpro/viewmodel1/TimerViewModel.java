package com.example.jetpackpro.viewmodel1;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * 项目名称 JetPackPro
 * 创建人 xiaojinli
 * 创建时间 2020/8/6 2:13 PM
 **/
public class TimerViewModel extends ViewModel {
    private MutableLiveData<Integer> mutableLiveData;

    public MutableLiveData<Integer> getMutableLiveData(){
        if(mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        return mutableLiveData;
    }


    public void changeValue() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    mutableLiveData.postValue(i);
                }

            }
        }).start();
    }
}
