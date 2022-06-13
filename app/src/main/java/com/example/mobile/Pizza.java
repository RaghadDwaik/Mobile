package com.example.mobile;

public class Pizza {


        private String name;
        private int imageID;

        public static final Pizza[] pizzas = {
                new Pizza("Chicken", R.drawable.pizza1),
                new Pizza("Vegetable", R.drawable.pizza2),

        };
        private Pizza(String name, int imageID){
            this.name = name;
            this.imageID = imageID;
        }
        public String getName(){return name;}
        public int getImageID(){return imageID;}


}
