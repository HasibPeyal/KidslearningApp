package com.example.dell.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Math extends AppCompatActivity {
    private Button numbutton, mathbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        numbutton = findViewById(R.id.numId);
        mathbutton = findViewById(R.id.mathId);
    }

    public void number(View v) {
        if (v.getId() == R.id.numId) {
            Intent intent = new Intent(Math.this, NumberActivity.class);
            startActivity(intent);

        }
    }

    public void math(View v) {
        if (v.getId() == R.id.mathId) {
            Intent intent = new Intent(Math.this, Main2Activity.class);
            startActivity(intent);

        }
    }
}
