package com.example.dell.firstproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeasonActivity extends AppCompatActivity {
private Button b1,b2,b3,b4,b5,b6;
private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season);
        b1=findViewById(R.id.sea1);
        b2=findViewById(R.id.sea2);
        b3=findViewById(R.id.sea3);
        b4=findViewById(R.id.sea4);
        b5=findViewById(R.id.sea5);
        b6=findViewById(R.id.sea6);


    }
    public void sea1(View v){
        if (v.getId() == R.id.sea1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.summer );

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }
    }
    public void sea2(View v){
        if (v.getId() == R.id.sea2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.rainy  );

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }
    }
    public void sea3(View v){
        if (v.getId() == R.id.sea3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.autumn  );

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }
    }
    public void sea4(View v){
        if (v.getId() == R.id.sea4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.late_autumn  );

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }
    }
    public void sea5(View v){
        if (v.getId() == R.id.sea5) {
            mediaPlayer = MediaPlayer.create(this, R.raw.winter );

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }
    }
    public void sea6(View v){
        if (v.getId() == R.id.sea6) {
            mediaPlayer = MediaPlayer.create(this, R.raw.spring );

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }
    }
}
