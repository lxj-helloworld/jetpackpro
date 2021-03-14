package com.example.jetpackpro.observer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jetpackpro.R;
import com.example.jetpackpro.viewmodel.NameViewModel;

public class NameActivity extends AppCompatActivity {
    private NameViewModel nameViewModel;
    private TextView nameTextView;
    private Button changeNameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        nameTextView = findViewById(R.id.nameTextView);

        changeNameButton = findViewById(R.id.changeNameButton);

        nameViewModel = new ViewModelProvider(this,new ViewModelProvider.NewInstanceFactory()).get(NameViewModel.class);


        final Observer<String> nameObserver = new Observer<String>() {
            @Override
            public void onChanged(String s) {
                nameTextView.setText(s);
            }
        };

        nameViewModel.getCurrentName().observe(this,nameObserver);



        changeNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameViewModel.getCurrentName().setValue("this is the new name value.");
            }
        });
    }
}
