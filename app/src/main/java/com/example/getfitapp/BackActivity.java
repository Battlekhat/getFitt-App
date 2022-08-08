package com.example.getfitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubeBaseActivity;

public class BackActivity extends YouTubeBaseActivity {

    YouTubePlayerView mYouTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    Button returnToMain;
    Button btnPlay;
    TextView description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        returnToMain = (Button) findViewById(R.id.button);
        btnPlay = (Button) findViewById(R.id.button2);
        mYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        description = (TextView) findViewById(R.id.textView8);

        onInitializedListener = new YouTubePlayer.OnInitializedListener(){

            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
                if (!wasRestored) youTubePlayer.cueVideo("Nq7GQxyMrW4");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(getApplicationContext(), "Video player Failed", Toast.LENGTH_SHORT).show();
            }
        };

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mYouTubePlayerView.initialize(PlayerConfig.API_KEY,onInitializedListener);
            }
        });


        returnToMain.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });



    }
}