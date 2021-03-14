package com.example.jetpackpro.databinding.bindingAdapter;

import android.graphics.Color;
import android.text.TextUtils;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.example.jetpackpro.R;
import com.squareup.picasso.Picasso;

/**
 * 项目名称 JetPackPro
 * 创建人 xiaojinli
 * 创建时间 2020/8/7 12:19 PM
 **/
public class ImageViewBindingAdapter {
    /**
     * 显示网络图片
     * @param imageView
     * @param imageUrl
     */
    @BindingAdapter("image")
    public static void setImage(ImageView imageView,String imageUrl){
        if(!TextUtils.isEmpty(imageUrl)){
            Picasso.get()
                    .load(imageUrl)
                    .placeholder(R.mipmap.ic_launcher_round)
                    .error(R.drawable.ic_launcher_background)
                    .into(imageView);
        }else{
            imageView.setBackgroundColor(Color.BLACK);
        }
    }


    /**
     * 显示本地图片
     * @param imageView
     * @param localImage
     */
    @BindingAdapter("image")
    public static void setImage(ImageView imageView,int localImage){
        imageView.setImageResource(localImage);
    }
}
