package com.example.jetpackpro.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.jetpackpro.R;
import com.example.jetpackpro.databinding.observerField.TwoWayBindingViewModel;

public class DataBindingActivity extends AppCompatActivity {
    private static final String TAG = "DataBindingActivity";
    Book book = new Book("这是书名","这是作者","20");
    TwoWayBindingViewModel twoWayBindingViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_data_binding);

        ActivityDataBindingBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding);


        binding.setBook(book);

        //注册事件类。
        binding.setEventHandlerListener(new EventHandlerListener());

        binding.setNetworkImage("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1337486992,1705035034&fm=26&gp=0.jpg");

        binding.setLocalImage(R.mipmap.localimage);

        twoWayBindingViewModel = new TwoWayBindingViewModel();
        binding.setLoginModel(twoWayBindingViewModel);
    }


    public class EventHandlerListener{
        public void changeBookName(View view){
//            Log.d(TAG,"改变书名");
//            book.setName("zhehsi xinde shuming ");
//            Log.d(TAG,"改变书名" + book.getName());
//            book.name = "rewrwrwrwr";



            Log.d(TAG,"用户名旧值：" + twoWayBindingViewModel.getUserName());
            twoWayBindingViewModel.setUserName("这是新的用户名");


        }
    }
}
