package com.example.mobile;

public class Burger {
    private String name;

    public int getPrice() {
        return price;
    }

    private int price;

    public Burger(String name, int imageID,int price) {
        this.name = name;
        this.imageID = imageID;
        this.price=price;

    }

    private int imageID;

    public static final Burger[] burgers = {
            new Burger("Classic Burger", R.drawable.burger1,27),
            new Burger("Mashroum Burger", R.drawable.burger2,30),
            new Burger("chicken Burger", R.drawable.burger3,25),
            new Burger("bargeque Burger", R.drawable.burger4,31),

    };



    public String getName(){return name;}
    public int getImageID(){return imageID;}



}
