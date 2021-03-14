package com.example.jetpackpro.navigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.jetpackpro.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {
    private static final String TAG = "SecondFragment";

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
//        Bundle bundle = getArguments();
//        if(bundle != null){
//            String name = bundle.getString("name");
//            int age = bundle.getInt("age");
//            Log.d(TAG,"name = " + name + "   age = " + age);
//        }

        Bundle bundle = getArguments();
        if(bundle != null){
            String name = MainFragmentArgs.fromBundle(getArguments()).getName();
            int age = MainFragmentArgs.fromBundle(getArguments()).getAge();
            Log.d(TAG,"name = " + name + "   age = " + age);
        }
        return view;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        menu.clear();
        super.onCreateOptionsMenu(menu, inflater);
    }
}
