package com.example.webapilab1;


public class TextModel {
 private String text;
    private int count;

    public TextModel(String text, int count) {
        this.text = text;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String getText() {
        return text;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setText(String text) {
        this.text = text;
    }
    
}