package com.marsya.foodapp03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Mie Level Maxca");

        Button mie_level_button = findViewById(R.id.mie_level_button);
        mie_level_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MieLevelActivity.class);
                startActivity(intent);
            }
        });

        Button minuman_button = findViewById(R.id.minuman_button);
        minuman_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MinumanActivity.class);
                startActivity(intent);
            }
        });

        Button snack_button = findViewById(R.id.snack_button);
        snack_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SnackActivity.class);
                startActivity(intent);
            }
        });
    }
}

