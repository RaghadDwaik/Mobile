package com.example.mobile;

public class Drinks {

    private String name;
    private int imageID;

    public static final Drinks[] drinks = {
            new Drinks("avocado milkshake ", R.drawable.img_2),
            new Drinks("Vanilla milkshake", R.drawable.img_3),
            new Drinks("Kinder milkshake", R.drawable.img_4),

    };
    private Drinks(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}


}

