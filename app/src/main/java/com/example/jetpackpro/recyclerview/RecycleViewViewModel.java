package com.example.jetpackpro.recyclerview;

import com.example.jetpackpro.databinding.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称 JetPackPro
 * 创建人 xiaojinli
 * 创建时间 3/14/21 10:15 PM
 **/
public class RecycleViewViewModel {
    public List<BookItem> getBook(){
        List<BookItem> list = new ArrayList<>();
        for(int i=0;i<10000;i++){
            BookItem bookItem = new BookItem("第"+i+"本书","作者" + i);
            bookItem.image = "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3829764873,2290468325&fm=26&gp=0.jpg";
            list.add(bookItem);
        }
        return list;
    }
}
