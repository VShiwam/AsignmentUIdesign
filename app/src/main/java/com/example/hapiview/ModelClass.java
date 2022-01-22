package com.example.hapiview;

public class ModelClass {

    private  int imageview;
    private String textview;


    ModelClass(int imageview, String textview){
        this.imageview=imageview;
        this.textview=textview;
    }

    public int getImageview() {
        return imageview;
    }

    public String getTextview() {
        return textview;
    }
}
