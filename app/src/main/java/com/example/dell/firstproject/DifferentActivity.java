package com.example.dell.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DifferentActivity extends AppCompatActivity implements View.OnClickListener {
    private Button week_button, season_button,month_button,flower_button,fruit_button;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_different);
        week_button = findViewById(R.id.button);
        week_button.setOnClickListener(this);
        season_button = findViewById(R.id.button27);
        season_button.setOnClickListener(this);
        month_button = findViewById(R.id.button28);
        month_button.setOnClickListener(this);
        flower_button = findViewById(R.id.button30);
        flower_button.setOnClickListener(this);
        fruit_button = findViewById(R.id.button31);
        fruit_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            Intent intent = new Intent(DifferentActivity.this, weekActivity.class);
            startActivity(intent);

        }
        if (v.getId() == R.id.button27) {
            Intent intent = new Intent(DifferentActivity.this, SeasonActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.button28) {
            Intent intent = new Intent(DifferentActivity.this, MonthActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.button30) {
            Intent intent = new Intent(DifferentActivity.this, FlowerActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.button31) {
            Intent intent = new Intent(DifferentActivity.this, fruitActivity.class);
            startActivity(intent);
        }
    }
}