package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class DesertsView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent in = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deserts_view);


        RecyclerView recycler = findViewById(R.id.deserts_recycler);

        String[] captions = new String[Deserts.deserts.length];
        int[] ids = new int[Deserts.deserts.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Deserts.deserts[i].getName();
            ids[i] = Deserts.deserts[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedDesertsAdapter adapter = new CaptionedDesertsAdapter(captions, ids);
        recycler.setAdapter(adapter);
    }
}