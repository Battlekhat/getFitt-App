package com.example.getfitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class BackActivity extends AppCompatActivity {

    Button returnToMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        returnToMain = (Button) findViewById(R.id.button);
        returnToMain.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });


        VideoView vidView= (VideoView)findViewById(R.id.bentOverRow);

        MediaController mediaControl = new MediaController(this);
        mediaControl.setAnchorView(vidView);
        Uri uri=Uri.parse("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/pyBHPoC8Nzo\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        vidView.setMediaController(mediaControl);
        vidView.setVideoURI(uri);
        vidView.requestFocus();
        vidView.start();
    }
}