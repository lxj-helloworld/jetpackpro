package com.example.jetpackpro.databinding;

/**
 * 项目名称 JetPackPro
 * 创建人 xiaojinli
 * 创建时间 2020/8/6 9:36 PM
 **/
public class Book {
    public String name;
    private String title;
    private String money;

    public Book(String name, String title, String money) {
        this.name = name;
        this.title = title;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
