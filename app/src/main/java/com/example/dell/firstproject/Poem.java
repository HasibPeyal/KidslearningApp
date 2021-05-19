package com.example.dell.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Poem extends AppCompatActivity {
    private Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);
        b1 = findViewById(R.id.pbtn1);
        b2=findViewById(R.id.pbtn2);
        b3=findViewById(R.id.pbtn3);
        b4=findViewById(R.id.pbtn4);
    }

    public void lis(View v){
        if (v.getId() == R.id.pbtn1) {
            Intent intent = new Intent(Poem.this, firstpoem.class);
            intent.putExtra("id","a");
            startActivity(intent);
        }
    }
    public void lis1(View v){
       // if (v.getId() == R.id.pbtn1) {
            Intent intent = new Intent(Poem.this, firstpoem.class);
            intent.putExtra("id","b");
            startActivity(intent);
     //   }
    }
    public void lis2(View v){
      //  if (v.getId() == R.id.pbtn1) {
            Intent intent = new Intent(Poem.this, firstpoem.class);
            intent.putExtra("id","c");
            startActivity(intent);
      //  }
    }
    public void lis3(View v){
       // if (v.getId() == R.id.pbtn1) {
            Intent intent = new Intent(Poem.this, firstpoem.class);
            intent.putExtra("id","d");
            startActivity(intent);
     //   }
    }
}

