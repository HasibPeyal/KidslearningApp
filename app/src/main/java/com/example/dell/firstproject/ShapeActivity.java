package com.example.dell.firstproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ShapeActivity extends AppCompatActivity {
    private ImageButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    private ImageView imageView;
    private TextView textView;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape);
        textView=findViewById(R.id.finaltext);
        imageView=findViewById(R.id.finalimage);
        button1=findViewById(R.id.button1Id);
        button2=findViewById(R.id.button2Id);
        button3=findViewById(R.id.button3Id);
        button4=findViewById(R.id.button4Id);
        button5=findViewById(R.id.button5Id);
        button6=findViewById(R.id.button6Id);
        button7=findViewById(R.id.button7Id);
        button8=findViewById(R.id.button8Id);
        button9=findViewById(R.id.button9Id);
        button10=findViewById(R.id.button10Id);

    }
    public void one(View v){
        if (v.getId() == R.id.button1Id) {
            mediaPlayer = MediaPlayer.create(this, R.raw.circle);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }
        textView.setTextColor(this.getResources().getColor(R.color.color_for_circle));
        textView.setText(" It is a circle");
        imageView.setImageResource(R.drawable.circle_image1);
    }
    public void two(View v){
        if (v.getId() == R.id.button2Id) {
            mediaPlayer = MediaPlayer.create(this, R.raw.rectangle);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }
        textView.setText("It is a rectangle");
        imageView.setImageResource(R.drawable.rectangle_image1);
        textView.setTextColor(this.getResources().getColor(R.color.color_for_rectangle));
    }
    public void three(View v){
        if (v.getId() == R.id.button3Id) {
            mediaPlayer = MediaPlayer.create(this, R.raw.trapezoid );

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }
        textView.setText("It is a trapezoid");
        textView.setTextColor(this.getResources().getColor(R.color.color_for_trapezoid));
        imageView.setImageResource(R.drawable.trapezoid_image);
    }
    public void four(View v){
        if (v.getId() == R.id.button4Id) {
            mediaPlayer = MediaPlayer.create(this, R.raw.circle );

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }
        textView.setTextColor(this.getResources().getColor(R.color.color_for_circle));
        textView.setText("It is a circle");
        imageView.setImageResource(R.drawable.circle_image1);
    }
    public void five(View v){
        if (v.getId() == R.id.button5Id) {
            mediaPlayer = MediaPlayer.create(this, R.raw.triangle);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }
        textView.setTextColor(this.getResources().getColor(R.color.color_for_traingle));
        textView.setText("It is a traingle");
        imageView.setImageResource(R.drawable.triangle1);
    }
    public void six(View v){
        if (v.getId() == R.id.button6Id) {
            mediaPlayer = MediaPlayer.create(this, R.raw.square );

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }
        textView.setTextColor(this.getResources().getColor(R.color.color_for_square));
        textView.setText("It is a square");
        imageView.setImageResource(R.drawable.square_image);
    }
    public void seven(View v){
        if (v.getId() == R.id.button7Id) {
            mediaPlayer = MediaPlayer.create(this, R.raw.rhombus);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }
        textView.setTextColor(this.getResources().getColor(R.color.color_for_rhombus));
        textView.setText("It is a rhombus");
        imageView.setImageResource(R.drawable.rhombus_image);
    }
    public void eight(View v){
        if (v.getId() == R.id.button8Id) {
            mediaPlayer = MediaPlayer.create(this, R.raw.octagon);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }
        textView.setTextColor(this.getResources().getColor(R.color.color_for_octagon));
        textView.setText("It is a octagon");
        imageView.setImageResource(R.drawable.octagon_image);
    }

    public void nine(View v){
        if (v.getId() == R.id.button9Id) {
            mediaPlayer = MediaPlayer.create(this, R.raw.hexagon );

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }
        textView.setTextColor(this.getResources().getColor(R.color.color_for_hexagon));
        textView.setText("It is a hexagon");
        imageView.setImageResource(R.drawable.hexagon_image1);
    }
    public void ten(View v){
        if (v.getId() == R.id.button10Id) {
            mediaPlayer = MediaPlayer.create(this, R.raw.star);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {

            }
            mediaPlayer.release();
        }
        textView.setTextColor(this.getResources().getColor(R.color.color_for_star));
        textView.setText("It is a star");
        imageView.setImageResource(R.drawable.star_image);
    }



}
