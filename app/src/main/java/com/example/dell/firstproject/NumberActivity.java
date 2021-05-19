package com.example.dell.firstproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumberActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_for1,button_for2,button_for3, button_for4, button_for5,button_for6,button_for7,
            button_for8,button_for9,button_for10,button_for11, button_for12,button_for13,button_for14,
            button_for15, button_for16,button_for17,button_for18,button_for19, button_for20;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        button_for1 = findViewById(R.id.button1);
        button_for2 = findViewById(R.id.button2);
        button_for3 = findViewById(R.id.button3);
        button_for4 = findViewById(R.id.button4);
        button_for5 = findViewById(R.id.button5);
        button_for6 = findViewById(R.id.button6);
        button_for7 = findViewById(R.id.button7);
        button_for8 = findViewById(R.id.button8);
        button_for9 = findViewById(R.id.button9);
        button_for10 = findViewById(R.id.button10);
        button_for11 = findViewById(R.id.button11);
        button_for12 = findViewById(R.id.button12);
        button_for13 = findViewById(R.id.button13);
        button_for14 = findViewById(R.id.button14);
        button_for15 = findViewById(R.id.button15);
        button_for16 = findViewById(R.id.button16);
        button_for17 = findViewById(R.id.button17);
        button_for18 = findViewById(R.id.button18);
        button_for19 = findViewById(R.id.button19);
        button_for20 = findViewById(R.id.button20);

        button_for1.setOnClickListener(this);
        button_for2.setOnClickListener(this);
        button_for3.setOnClickListener(this);
        button_for4.setOnClickListener(this);
        button_for5.setOnClickListener(this);
        button_for6.setOnClickListener(this);
        button_for7.setOnClickListener(this);
        button_for8.setOnClickListener(this);
        button_for9.setOnClickListener(this);
        button_for10.setOnClickListener(this);
        button_for11.setOnClickListener(this);
        button_for12.setOnClickListener(this);
        button_for13.setOnClickListener(this);
        button_for14.setOnClickListener(this);
        button_for15.setOnClickListener(this);
        button_for17.setOnClickListener(this);
        button_for16.setOnClickListener(this);
        button_for18.setOnClickListener(this);
        button_for19.setOnClickListener(this);
        button_for20.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button1:
                mediaPlayer=MediaPlayer.create(this,R.raw.one);
                break;
            case R.id.button2:
                mediaPlayer=MediaPlayer.create(this,R.raw.two);
                break;
            case R.id.button3:
                mediaPlayer=MediaPlayer.create(this,R.raw.three);
                break;
            case R.id.button4:
                mediaPlayer=MediaPlayer.create(this,R.raw.four);
                break;
            case R.id.button5:
                mediaPlayer=MediaPlayer.create(this,R.raw.five);
                break;
            case R.id.button6:
                mediaPlayer=MediaPlayer.create(this,R.raw.six);
                break;
            case R.id.button7:
                mediaPlayer=MediaPlayer.create(this,R.raw.seven);
                break;
            case R.id.button8:
                mediaPlayer=MediaPlayer.create(this,R.raw.eight);
                break;
            case R.id.button9:
                mediaPlayer=MediaPlayer.create(this,R.raw.nine);
                break;
            case R.id.button10:
                mediaPlayer=MediaPlayer.create(this,R.raw.ten);
                break;
            case R.id.button11:
                mediaPlayer=MediaPlayer.create(this,R.raw.eleven);
                break;
            case R.id.button12:
                mediaPlayer=MediaPlayer.create(this,R.raw.twelve);
                break;
            case R.id.button13:
                mediaPlayer=MediaPlayer.create(this,R.raw.thirteen);
                break;
            case R.id.button14:
                mediaPlayer=MediaPlayer.create(this,R.raw.fourteen);
                break;
            case R.id.button15:
                mediaPlayer=MediaPlayer.create(this,R.raw.fifteen);
                break;
            case R.id.button16:
                mediaPlayer=MediaPlayer.create(this,R.raw.sixteen);
                break;
            case R.id.button17:
                mediaPlayer=MediaPlayer.create(this,R.raw.seventeen);
                break;
            case R.id.button18:
                mediaPlayer=MediaPlayer.create(this,R.raw.eighteen);
                break;
            case R.id.button19:
                mediaPlayer=MediaPlayer.create(this,R.raw.nineteen);
                break;
            case R.id.button20:
                mediaPlayer=MediaPlayer.create(this,R.raw.twenty);
                break;
        }
        mediaPlayer.start();
        while (mediaPlayer.isPlaying()){

        }
        mediaPlayer.release();
    }
}
