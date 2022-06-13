package com.example.mobile;

public class Shawerma {

    private String name;

    public Shawerma(String name, int imageID) {
        this.name = name;
        this.imageID = imageID;
    }

    private int imageID;

    public static final Shawerma[] shawermas = {
            new Shawerma("Chicken", R.drawable.shawerma),
            new Shawerma("Meat", R.drawable.shawerma2),
            new Shawerma("mix", R.drawable.shawerma3),

    };



    public String getName(){return name;}
    public int getImageID(){return imageID;}


}

