package com.samurusproductions.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_join;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_join = findViewById(R.id.button_join);
        button_join.setOnClickListener(e -> {
            MainActivity.this.startActivity(new Intent(this, GameActivity.class));
        });
    }
}



