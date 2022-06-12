package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Customer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
        Intent in =getIntent();

            ListView listView = (ListView) findViewById(R.id.list);

            AdapterView.OnItemClickListener itemclick = new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 0) {
                        Intent in = new Intent(Customer.this, DrinksView.class);
                        startActivity(in);
                    }
                    if (position == 1) {
                        Intent in = new Intent(Customer.this, BurgerView.class);
                        startActivity(in);
                    }

                    if (position == 2) {
                        Intent in = new Intent(Customer.this, shawermaView.class);
                        startActivity(in);
                    }

                    if (position == 3) {
                        Intent in = new Intent(Customer.this, DesertsView.class);
                        startActivity(in);
                    }

                    if (position == 4) {
                        Intent in= new Intent(Customer.this, pizzaView.class);
                        startActivity(in);
                    }

                }




            };
            listView.setOnItemClickListener(itemclick);
        }



    }
