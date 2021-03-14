package com.example.jetpackpro.recyclerview;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.example.jetpackpro.R;
import com.squareup.picasso.Picasso;

/**
 * 项目名称 JetPackPro
 * 创建人 xiaojinli
 * 创建时间 3/14/21 9:31 PM
 **/
public class RecycleViewImageAdapter {
    private static final String TAG = "RecycleViewImageAdapter";
    @BindingAdapter("itemBookImage")
    public static void setImage(ImageView imageView,String imageUrl){
        Log.i(TAG, "setImage: imageUrl = " + imageUrl);
        if(!TextUtils.isEmpty(imageUrl)){
            Picasso.get()
                    .load(imageUrl)
                    .placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_foreground)
                    .into(imageView);
        }else{
            imageView.setBackgroundColor(Color.BLACK);
        }
    }
}
