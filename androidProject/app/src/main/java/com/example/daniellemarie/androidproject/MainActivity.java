package com.example.daniellemarie.androidproject;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    static MediaPlayer gameOnsound;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button a = findViewById(R.id.startButton);
        Button b = findViewById(R.id.scoreButton);


        gameOnsound = MediaPlayer.create(MainActivity.this,R.raw.abt);

        gameOnsound.start();

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, introd.class);
                gameOnsound.stop();
                startActivity(intent);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, about.class);
                gameOnsound.stop();
                startActivity(intent);
            }
        });




    }


}
