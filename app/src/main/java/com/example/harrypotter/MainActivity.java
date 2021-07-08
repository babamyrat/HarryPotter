package com.example.harrypotter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    CardView btnStart1, btnStart2, btnStart3, btnStart4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart1 = findViewById(R.id.btnStart1);
        btnStart1.setOnClickListener(v -> {
            String name = "http://hp-api.herokuapp.com/api/characters";
            Intent intent = new Intent(MainActivity.this, GroupActivity.class);
            intent.putExtra("key", name);
            startActivity(intent);
        });

        btnStart2 = findViewById(R.id.btnStart2);
        btnStart2.setOnClickListener(v -> {
            String name = "http://hp-api.herokuapp.com/api/characters/students";
            Intent intent = new Intent(MainActivity.this, GroupActivity.class);
            intent.putExtra("key", name);
            startActivity(intent);
        });

        btnStart3 = findViewById(R.id.btnStart3);
        btnStart3.setOnClickListener(v -> {
            String name = "http://hp-api.herokuapp.com/api/characters/staff";
            Intent intent = new Intent(MainActivity.this, GroupActivity.class);
            intent.putExtra("key", name);
            startActivity(intent);
        });

        btnStart4 = findViewById(R.id.btnStart4);
        btnStart4.setOnClickListener(v -> {
            String name = "http://hp-api.herokuapp.com/api/characters/house/gryffindor";
            Intent intent = new Intent(MainActivity.this, GroupActivity.class);
            intent.putExtra("key", name);
            startActivity(intent);
        });

    }

}