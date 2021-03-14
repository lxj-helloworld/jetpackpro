package com.example.jetpackpro.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
    private String name;
    private int age;
    private double score;

    public Student(String name,int age,double score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    protected Student(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
        this.score = in.readDouble();
    }
    //负责反序列化
    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    //负责序列化
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
        dest.writeDouble(score);
    }
}
