package com.example.dell.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView alphabetCardView, numberCardView, directionCardView, shapeCardView, colorCardView, add_subCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alphabetCardView = findViewById(R.id.alphabetId);
        numberCardView = findViewById(R.id.numberId);
        directionCardView = findViewById(R.id.directionId);
        shapeCardView = findViewById(R.id.shapeId);
        colorCardView = findViewById(R.id.colorId);
        add_subCardView = findViewById(R.id.Add_subId);


        alphabetCardView.setOnClickListener(this);
        numberCardView.setOnClickListener(this);
        directionCardView.setOnClickListener(this);
        shapeCardView.setOnClickListener(this);
        colorCardView.setOnClickListener(this);
        add_subCardView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.alphabetId) {
            Intent intent = new Intent(MainActivity.this, AlphabetActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.numberId) {
            Intent intent = new Intent(MainActivity.this, Math.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.Add_subId) {

            Intent intent = new Intent(MainActivity.this, Poem.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.colorId) {

            Intent intent = new Intent(MainActivity.this, ColorActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.shapeId) {

            Intent intent = new Intent(MainActivity.this, ShapeActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.directionId) {

            Intent intent = new Intent(MainActivity.this, DifferentActivity.class);
            startActivity(intent);
        }
    }
}


