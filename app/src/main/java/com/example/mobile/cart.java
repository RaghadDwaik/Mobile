package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.icu.lang.UCharacter;
import android.os.Bundle;

public class cart extends AppCompatActivity {


    private String[] captions;
    private int[] imageIds;
    private int []price;
    RecyclerView cartrecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        Intent in = getIntent();

        RecyclerView recycler = findViewById(R.id.burger_recycler);
      //  recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedburgerAdapter adapter = new CaptionedburgerAdapter(captions, imageIds,price);
      //  cartrecycler.setAdapter(adapter);
        //recycler.setLayoutManager(new LinearLayoutManager(this));
        //recycler.setHasFixedSize(true);

    }
}