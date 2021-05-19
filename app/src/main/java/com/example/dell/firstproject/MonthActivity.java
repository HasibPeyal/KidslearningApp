package com.example.dell.firstproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MonthActivity extends AppCompatActivity {
     private Button but1,but2,but3,but4,but5,but6,but7,but8,but9,but10,but11,but12;
     private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month);
        but1=findViewById(R.id.b1);
        but2=findViewById(R.id.b2);
        but3=findViewById(R.id.b3);
        but4=findViewById(R.id.b4);
        but5=findViewById(R.id.b5);
        but6=findViewById(R.id.b6);
        but7=findViewById(R.id.b7);
        but8=findViewById(R.id.b8);
        but9=findViewById(R.id.b9);
        but10=findViewById(R.id.b10);
        but11=findViewById(R.id.b11);
        but12=findViewById(R.id.b12);
    }
    public void jan(View v) {
        if (v.getId() == R.id.b1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.january);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }

    }
    public void feb(View v) {
        if (v.getId() == R.id.b2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.february);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }

    }
    public void mar(View v) {
        if (v.getId() == R.id.b3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.march);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }

    }
    public void apr(View v) {
        if (v.getId() == R.id.b4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.april);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }

    }
    public void may(View v) {
        if (v.getId() == R.id.b5) {
            mediaPlayer = MediaPlayer.create(this, R.raw.may);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }

    }
    public void june(View v) {
        if (v.getId() == R.id.b6) {
            mediaPlayer = MediaPlayer.create(this, R.raw.june);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }

    }
    public void july(View v) {
        if (v.getId() == R.id.b7) {
            mediaPlayer = MediaPlayer.create(this, R.raw.july);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }

    }
    public void aug(View v) {
        if (v.getId() == R.id.b8) {
            mediaPlayer = MediaPlayer.create(this, R.raw.august);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }

    }
    public void sep(View v) {
        if (v.getId() == R.id.b9) {
            mediaPlayer = MediaPlayer.create(this, R.raw.september);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }

    }
    public void oct(View v) {
        if (v.getId() == R.id.b10) {
            mediaPlayer = MediaPlayer.create(this, R.raw.october);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }

    }
    public void nov(View v) {
        if (v.getId() == R.id.b11) {
            mediaPlayer = MediaPlayer.create(this, R.raw.november);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }

    }
    public void dec(View v) {
        if (v.getId() == R.id.b10) {
            mediaPlayer = MediaPlayer.create(this, R.raw.december);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }

    }


}
