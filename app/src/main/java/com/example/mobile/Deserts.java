package com.example.mobile;

public class Deserts {

    private String name;
    private int imageID;

    public static final Deserts[] deserts = {
            new Deserts("Velvet Cake", R.drawable.img),
            new Deserts("Chocolate Suffle", R.drawable.img_1),

    };
    private Deserts(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}


}

