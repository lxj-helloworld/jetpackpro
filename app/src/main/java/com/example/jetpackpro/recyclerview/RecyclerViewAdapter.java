package com.example.jetpackpro.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jetpackpro.R;
import com.example.jetpackpro.databinding.Book;
import com.example.jetpackpro.databinding.ItemBookBinding;

import java.util.List;

/**
 * 项目名称 JetPackPro
 * 创建人 xiaojinli
 * 创建时间 3/14/21 9:38 PM
 **/
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private List<BookItem> bookItems;
    public RecyclerViewAdapter(List<BookItem> list){
        this.bookItems = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutItemBinding

        ItemBookBinding itemBookBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_book,
                parent,false);
        return new MyViewHolder(itemBookBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        BookItem bookItem = bookItems.get(position);
        holder.itemBookBinding.setBook(bookItem);


    }

    @Override
    public int getItemCount() {
        return bookItems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ItemBookBinding itemBookBinding;
        public MyViewHolder(ItemBookBinding itemBookBinding) {
            super(itemBookBinding.getRoot());
            this.itemBookBinding = itemBookBinding;
        }
    }
}
