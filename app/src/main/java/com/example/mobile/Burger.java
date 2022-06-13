package com.example.mobile;

public class Burger {
    private String name;

    public Burger(String name, int imageID) {
        this.name = name;
        this.imageID = imageID;
    }

    private int imageID;

    public static final Burger[] burgers = {
            new Burger("Classic Burger", R.drawable.burger1),
            new Burger("Mashroum Burger", R.drawable.burger2),
            new Burger("chicken Burger", R.drawable.burger3),
            new Burger("bargeque Burger", R.drawable.burger4),

    };



    public String getName(){return name;}
    public int getImageID(){return imageID;}



}
