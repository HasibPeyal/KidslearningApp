package com.example.dell.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class firstpoem extends AppCompatActivity {
    private String string;
     private Intent intent;
     private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpoem);
        imageView = findViewById(R.id.poemid);
        intent = getIntent();
        string = intent.getStringExtra("id");
        if (string.equals("a")) {
            imageView.setImageResource(R.drawable.johnny_1);
        }
       else if (string.equals("b")) {
            imageView.setImageResource(R.drawable.twinkle_twinkle_little_star);
        }
     else   if (string.equals("c")) {
            imageView.setImageResource(R.drawable.humpty_dumpty);
        }
       else if (string.equals("d")) {
            imageView.setImageResource(R.drawable.jack_and_jill);
        }
    }
}

