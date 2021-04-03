package com.example.cookie_alpaca;

import android.provider.ContactsContract;

public class DataSet {
    private String name;
    private int id;


    public DataSet(int pictureId, String animalName) {
        id = pictureId;
        name = animalName;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
