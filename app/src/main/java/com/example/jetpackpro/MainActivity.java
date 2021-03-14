package com.example.jetpackpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jetpackpro.observer.MyObserver;
import com.example.jetpackpro.observer.NameActivity;

public class MainActivity extends AppCompatActivity {
    private MyObserver myObserver;

    private Button liveDataButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myObserver = new MyObserver();
        getLifecycle().addObserver(myObserver);

        liveDataButton = findViewById(R.id.liveDataButton);

        liveDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NameActivity.class);
                startActivity(intent);
            }
        });
    }
}
