package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class pizzaView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent in = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_view);


        RecyclerView recycler = findViewById(R.id.pizza_recycler);

        String[] captions = new String[Pizza.pizzas.length];
        int[] ids = new int[Pizza.pizzas.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Pizza.pizzas[i].getName();
            ids[i] = Pizza.pizzas[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
        recycler.setAdapter(adapter);
    }
}