package com.example.getfitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backButton = (ImageButton) findViewById(R.id.backButton);
        backButton.setOnClickListener(V ->
        {
            Intent intentBack = new Intent(this, BackActivity.class);
            startActivity(intentBack);
        });

    }
}