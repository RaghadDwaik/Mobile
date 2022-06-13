package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class shawermaView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent in = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shawerma_view);


        RecyclerView recycler = findViewById(R.id.shawerma_recycler);

        String[] captions = new String[Shawerma.shawermas.length];
        int[] ids = new int[Shawerma.shawermas.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Shawerma.shawermas[i].getName();
            ids[i] = Shawerma.shawermas[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedshawermaAdapter adapter = new CaptionedshawermaAdapter(captions, ids);
        recycler.setAdapter(adapter);
    }
}