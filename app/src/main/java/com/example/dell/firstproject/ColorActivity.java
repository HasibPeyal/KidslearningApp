package com.example.dell.firstproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.PrivateKey;

public class ColorActivity extends AppCompatActivity implements View.OnClickListener {
    private Button Red_Button,Dark_Button,Yellow_Button,Blue_Button,purple_Button,Magenta_Button,Orange_Button,Green_Button;
    private TextView textview;
    private ImageView imageview;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        Dark_Button=findViewById(R.id.button1);
        Red_Button=findViewById(R.id.button2);
        Blue_Button=findViewById(R.id.button3);
        Green_Button=findViewById(R.id.button4);
        Yellow_Button=findViewById(R.id.button5);
        Orange_Button=findViewById(R.id.button6);
        purple_Button=findViewById(R.id.button7);
        Magenta_Button=findViewById(R.id.button8);
        textview=findViewById(R.id.textId);
        imageview=findViewById(R.id.imageId);


        Dark_Button.setOnClickListener(this);
        Red_Button.setOnClickListener(this);
        Blue_Button.setOnClickListener(this);
        Green_Button.setOnClickListener(this);

        Yellow_Button.setOnClickListener(this);
        Orange_Button.setOnClickListener(this);
        purple_Button.setOnClickListener(this);
        Magenta_Button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button1) {
            textview.setText("Black");
            textview.setTextColor(this.getResources().getColor(R.color.color_for_dark));
            imageview.setImageResource(R.drawable.darkimage);
            mediaPlayer= MediaPlayer.create(this,R.raw.black);

        }
        if (v.getId() == R.id.button2) {
            textview.setText("Red");
            textview.setTextColor(this.getResources().getColor(R.color.color_for_red));
            imageview.setImageResource(R.drawable.red_image);
            mediaPlayer= MediaPlayer.create(this,R.raw.red);
        }
        if (v.getId() == R.id.button3) {
            textview.setText("Blue");
            textview.setTextColor(this.getResources().getColor(R.color.color_for_blue));
            imageview.setImageResource(R.drawable.blueimage);
            mediaPlayer= MediaPlayer.create(this,R.raw.blue);
        }
        if (v.getId() == R.id.button4) {
            textview.setText("Green");
            textview.setTextColor(this.getResources().getColor(R.color.color_for_green));
            imageview.setImageResource(R.drawable.greenimage);
            mediaPlayer= MediaPlayer.create(this,R.raw.green);
        }
        if (v.getId() == R.id.button5) {
            textview.setText("Yellow");
            textview.setTextColor(this.getResources().getColor(R.color.color_for_yellow));
            imageview.setImageResource(R.drawable.yellow);
            mediaPlayer= MediaPlayer.create(this,R.raw.yellow);

        }
        if (v.getId() == R.id.button6) {
            textview.setText("Orange");
            textview.setTextColor(this.getResources().getColor(R.color.color_for_orange));
            imageview.setImageResource(R.drawable.orange);
            mediaPlayer= MediaPlayer.create(this,R.raw.orange );
        }
        if (v.getId() == R.id.button7) {
            textview.setText("Purple");
            textview.setTextColor(this.getResources().getColor(R.color.color_for_purple));
            imageview.setImageResource(R.drawable.purple);
            mediaPlayer= MediaPlayer.create(this,R.raw.purple);
        }
        if (v.getId() == R.id.button8) {
            textview.setText("Magenta");
            textview.setTextColor(this.getResources().getColor(R.color.color_for_magenta));
            imageview.setImageResource(R.drawable.magenta);
            mediaPlayer= MediaPlayer.create(this,R.raw.magenta );
        }
        mediaPlayer.start();
        while (mediaPlayer.isPlaying()){

        }
        mediaPlayer.release();

    }

}

