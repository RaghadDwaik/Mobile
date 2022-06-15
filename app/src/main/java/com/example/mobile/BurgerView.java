package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BurgerView extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent in = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger_view);


        RecyclerView recycler = findViewById(R.id.burger_recycler);

        String[] captions = new String[Burger.burgers.length];
        int[] ids = new int[Burger.burgers.length];
        int[] price = new int[Burger.burgers.length];

        for(int i = 0; i<price.length;i++){
            captions[i] = Burger.burgers[i].getName();
            ids[i] = Burger.burgers[i].getImageID();
            price[i]= Burger.burgers[i].getPrice();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedburgerAdapter adapter = new CaptionedburgerAdapter(captions, ids,price);
        recycler.setAdapter(adapter);
    }

    public void btncart(View view) {
        Intent in = new Intent(this,cart.class);
        startActivity(in);
    }
}