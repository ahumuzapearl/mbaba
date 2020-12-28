package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hassan1 extends AppCompatActivity {
Button btnplay;
Button btnstop;
MediaPlayer play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hassan1);
        btnplay=findViewById(R.id.btnplay);
        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play= MediaPlayer.create(getApplicationContext(),R.raw.party);
                play.start();
            }
        });
        btnstop=findViewById(R.id.btnstop);
        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (play!=null && play.isPlaying());

                play.stop();
            }
        });
    }
}
