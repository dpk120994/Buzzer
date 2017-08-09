package com.example.sourcekode1.buzzer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MediaPlayer player=MediaPlayer.create(this,R.raw.fallingbomb);
        player.start();
    }
}
