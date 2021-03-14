package com.example.jetpackpro.databinding.observerField;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;
import androidx.databinding.library.baseAdapters.BR;

/**
 * 项目名称 JetPackPro
 * 创建人 xiaojinli
 * 创建时间 2020/8/7 4:33 PM
 **/
public class TwoWayBindingViewModel extends BaseObservable {
    private static final String TAG = "TwoWayBindingViewModel";
    private LoginModel loginModel;

    public TwoWayBindingViewModel() {
        loginModel = new LoginModel();
        loginModel.userName = "hello World.";
    }

    @Bindable
    public String getUserName(){
        return loginModel.userName;
    }

    @Bindable
    public void setUserName(String name){
        Log.d(TAG,"in setUserName");
        if(name != null && !name.equals(loginModel.userName)){
            loginModel.userName = name;
            notifyPropertyChanged(BR.userName);
        }
    }
}
