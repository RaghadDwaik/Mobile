package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class BurgerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent in = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger_view);


        RecyclerView recycler = findViewById(R.id.burger_recycler);

        String[] captions = new String[Burger.burgers.length];
        int[] ids = new int[Burger.burgers.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Burger.burgers[i].getName();
            ids[i] = Burger.burgers[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedburgerAdapter adapter = new CaptionedburgerAdapter(captions, ids);
        recycler.setAdapter(adapter);
    }
}