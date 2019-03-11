package com.example.daniellemarie.androidproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class end extends AppCompatActivity {


    static MediaPlayer gameOnsound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        gameOnsound = MediaPlayer.create(end.this,R.raw.home);
        gameOnsound.start();
        Button a = findViewById(R.id.back);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(end.this, MainActivity.class);


gameOnsound.stop();
                startActivity(intent);
            }
        });


    }
}
