package com.example.jetpackpro.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.jetpackpro.R;
import com.example.jetpackpro.databinding.ActivityDataBindingBinding;
import com.example.jetpackpro.databinding.ActivityRecyclerViewBinding;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityRecyclerViewBinding dataBindingBinding = DataBindingUtil.setContentView(this,R.layout.activity_recycler_view);
//        dataBindingBinding.re
        dataBindingBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        dataBindingBinding.recyclerView.setHasFixedSize(true);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(new RecycleViewViewModel().getBook());
        dataBindingBinding.recyclerView.setAdapter(adapter);
    }

}