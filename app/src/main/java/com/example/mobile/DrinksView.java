package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class DrinksView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent in = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_view);


        RecyclerView recycler = findViewById(R.id.drinks_recycler);

        String[] captions = new String[Drinks.drinks.length];
        int[] ids = new int[Drinks.drinks.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Drinks.drinks[i].getName();
            ids[i] = Drinks.drinks[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedDrinksAdapter adapter = new CaptionedDrinksAdapter(captions, ids);
        recycler.setAdapter(adapter);
    }
}