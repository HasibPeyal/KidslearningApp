package com.example.dell.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class A_alphabetActivity extends AppCompatActivity {
    private String string;
    Intent intent;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_alphabet);
        imageView=findViewById(R.id.A_image);
        textView=findViewById(R.id.a_text);
        intent = getIntent();
        string = intent.getStringExtra("id");
        if(string.equals("a"))
        {
            textView.setText("APPLE");
            imageView.setImageResource(R.drawable.a_apple_image);
        }
        if(string.equals("b"))
        {
            textView.setText("BALL");
            imageView.setImageResource(R.drawable.b_image);
        }
        else if(string.equals("k"))
        {
            textView.setText("KITE");
            imageView.setImageResource(R.drawable.k_image);
        }
        else if(string.equals("l"))
        {
            textView.setText("LION");
            imageView.setImageResource(R.drawable.l_image);
        }

        else if(string.equals("m"))
        {
            textView.setText("MANGO");
            imageView.setImageResource(R.drawable.m_image);
        }

        else if(string.equals("n"))
        {
            textView.setText("NEST");
            imageView.setImageResource(R.drawable.n_image);
        }

        else if(string.equals("o"))
        {
            textView.setText("OWL");
            imageView.setImageResource(R.drawable.o_image);
        }
        else if(string.equals("p"))
        {
            textView.setText("PARROT");
            imageView.setImageResource(R.drawable.p_image);
        }

        else if(string.equals("q"))
        {
            textView.setText("QUEEN");
            imageView.setImageResource(R.drawable.q_image);
        }

        else if(string.equals("r"))
        {
            textView.setText("RABBIT");
            imageView.setImageResource(R.drawable.r_image);
        }

        else if(string.equals("s"))
        {
            textView.setText("SKY");
            imageView.setImageResource(R.drawable.s_image1);
        }
        else if(string.equals("t"))
        {
            textView.setText("TREE");
            imageView.setImageResource(R.drawable.t_image);
        }

        else if(string.equals("u"))
        {
            textView.setText("UMBRELLA");
            imageView.setImageResource(R.drawable.u_image);
        }

        else if(string.equals("v"))
        {
            textView.setText("VASE");
            imageView.setImageResource(R.drawable.v_image);
        }

        else if(string.equals("w"))
        {
            textView.setText("WATCH");
            imageView.setImageResource(R.drawable.w_image);
        }
        else if(string.equals("x"))
        {
            textView.setText("X-Mass_Tree");
            imageView.setImageResource(R.drawable.x_image);
        }

        else if(string.equals("y"))
        {
            textView.setText("YOLK");
            imageView.setImageResource(R.drawable.y_image);
        }

        else if(string.equals("z"))
        {
            textView.setText("ZEBRA");
            imageView.setImageResource(R.drawable.z_image);
        }


    }

}
