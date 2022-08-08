package com.example.getfitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {

    ImageButton backButton;
    ImageButton chestButton;
    ImageButton coreButton;
    ImageButton upperLegs;
    ImageButton totalBody;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backButton = (ImageButton) findViewById(R.id.backButton);
        backButton.setOnClickListener(this); // calling onClick() method

        chestButton = (ImageButton) findViewById(R.id.chestButton);
        chestButton.setOnClickListener(this);

        coreButton = (ImageButton) findViewById(R.id.coreButton);
        coreButton.setOnClickListener(this);

        upperLegs = (ImageButton) findViewById(R.id.upLegsButton);
        upperLegs.setOnClickListener(this);

        totalBody = (ImageButton) findViewById(R.id.totalBodButton);
        totalBody.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.backButton:
                Intent intentBack = new Intent(this, BackActivity.class);
                startActivity(intentBack);
                break;

            case R.id.chestButton:
                Intent intentChest = new Intent(this, ChestActivity.class);
                startActivity(intentChest);
                break;
            case R.id.coreButton:
                Intent intentCore = new Intent(this, CoreActivity.class);
                startActivity(intentCore);
                break;
            case R.id.upLegsButton:
                Intent intentUppLegs = new Intent(this, UpLegsActivity.class);
                startActivity(intentUppLegs);
                break;
            case R.id.totalBodButton:
                Intent intentTotBod = new Intent(this, TotBodActivity.class);
                startActivity(intentTotBod);
                break;

            default:
                break;
        }
    }
}