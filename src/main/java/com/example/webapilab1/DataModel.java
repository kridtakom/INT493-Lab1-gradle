package com.example.webapilab1;

import java.util.ArrayList;

public class DataModel {

    private ArrayList<TextModel> data = new ArrayList<TextModel>();

    public ArrayList<TextModel> getData() {
        return data;
    }

    public void setData(ArrayList<TextModel> data) {
        this.data = data;
    }
}