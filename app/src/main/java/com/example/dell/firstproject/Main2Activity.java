package com.example.dell.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText1, editText2;
    private Button addButton, subButton,multibutton,divbutton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText1 = findViewById(R.id.edit1Id);
        editText2 = findViewById(R.id.edit2Id);
        addButton = findViewById(R.id.addId);
        subButton = findViewById(R.id.subId);
        multibutton = findViewById(R.id.multiId);
        divbutton = findViewById(R.id.divId);
        resultTextView = findViewById(R.id.resultTextviewId);
        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        multibutton.setOnClickListener(this);
        divbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        try {
            String number1 = editText1.getText().toString();
            String number2 = editText2.getText().toString();
            Integer num1 = Integer.parseInt(number1);
            Integer num2 = Integer.parseInt(number2);

            if (v.getId() == R.id.addId) {
                Integer sum=num1+num2;
                resultTextView.setText("Result:"   +sum);

            }
            if (v.getId() == R.id.subId) {
                Integer sub=num1-num2;
                resultTextView.setText("Result:"   +sub);
            }
            if (v.getId() == R.id.multiId) {
                Integer multipy=num1*num2;
                resultTextView.setText("Result:"   +multipy);

            }
            if (v.getId() == R.id.divId) {
                Integer division=num1/num2;
                resultTextView.setText("Result:"   +division);
            }

        }catch(Exception e){
            Toast.makeText(Main2Activity.this,"Please Enter Numbers",Toast.LENGTH_SHORT).show();
        }

    }
}
