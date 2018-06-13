package com.example.administrator.test_2_1;

public class ListData {
    public int id;
    public String title;
    public String text;
    public int picturePath;

    public ListData(){
    }
    public ListData(int id,String title,String text,int picturePath){
        this.id = id;
        this.title = title;
        this.text = text;
        this.picturePath = picturePath;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPicturePath(int picturePath) {
        this.picturePath = picturePath;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
