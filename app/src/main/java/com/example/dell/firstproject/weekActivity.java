package com.example.dell.firstproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class weekActivity extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6,button7;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);
        button1=findViewById(R.id.btn1);
        button2=findViewById(R.id.btn2);
        button3=findViewById(R.id.btn3);
        button4=findViewById(R.id.btn4);
        button5=findViewById(R.id.btn5);
        button6=findViewById(R.id.btn6);
        button7=findViewById(R.id.btn7);
    }
    public void sat(View v){
        if (v.getId() == R.id.btn1) {
            mediaPlayer= MediaPlayer.create(this,R.raw.sat);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
    }
    public void sun(View v){
        if (v.getId() == R.id.btn2) {
            mediaPlayer= MediaPlayer.create(this,R.raw.sun);
            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
    }
    public void mon(View v){
        if (v.getId() == R.id.btn3) {
            mediaPlayer= MediaPlayer.create(this,R.raw.mon);
            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
    }
    public void thus(View v){
        if (v.getId() == R.id.btn4) {
            mediaPlayer= MediaPlayer.create(this,R.raw.tue);
            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
    }
    public void wed(View v){
        if (v.getId() == R.id.btn5) {
            mediaPlayer= MediaPlayer.create(this,R.raw.wed);
            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
    }
    public void thurs(View v){
        if (v.getId() == R.id.btn6) {
            mediaPlayer= MediaPlayer.create(this,R.raw.thu);
            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
    }
    public void fri(View v){
        if (v.getId() == R.id.btn6) {
            mediaPlayer= MediaPlayer.create(this,R.raw.fri);
            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
    }



}
