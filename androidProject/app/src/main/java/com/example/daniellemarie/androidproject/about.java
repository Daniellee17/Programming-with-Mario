package com.example.daniellemarie.androidproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class about extends AppCompatActivity {

    static MediaPlayer abtsound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        abtsound = MediaPlayer.create(about.this,R.raw.home);

        abtsound.start();

        Button a = findViewById(R.id.back);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about.this, MainActivity.class);

                abtsound.stop();

                startActivity(intent);
            }
            });


        }
    }
