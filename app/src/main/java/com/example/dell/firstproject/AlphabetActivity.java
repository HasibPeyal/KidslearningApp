package com.example.dell.firstproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AlphabetActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button_a,button_b,button_c,button_d,button_e,button_f,button_g,button_h,
            button_i,button_j,button_k,button_l,button_m,button_n,button_o,button_p,button_q,
             button_r,button_s,button_t,button_u,button_v,button_w,button_x,button_y,button_z;
    private TextView textView;
    private ImageView imageView;
    private MediaPlayer mediaPlayer;
   // private String string = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        button_a = findViewById(R.id.button1);
        button_a.setOnClickListener(this);
        button_b = findViewById(R.id.button2);
        button_b.setOnClickListener(this);
        button_b = findViewById(R.id.button2);
        button_b.setOnClickListener(this);
        button_c = findViewById(R.id.button3);
        button_c.setOnClickListener(this);
        button_d = findViewById(R.id.button4);
        button_d.setOnClickListener(this);
        button_e = findViewById(R.id.button5);
        button_e.setOnClickListener(this);
        button_f = findViewById(R.id.button6);
        button_f.setOnClickListener(this);
        button_g = findViewById(R.id.button7);
        button_g.setOnClickListener(this);
        button_h = findViewById(R.id.button8);
        button_h.setOnClickListener(this);
        button_i = findViewById(R.id.button9);
        button_i.setOnClickListener(this);
        button_j = findViewById(R.id.button10);
        button_j.setOnClickListener(this);
        button_k = findViewById(R.id.button11);
        button_k.setOnClickListener(this);
        button_l = findViewById(R.id.button12);
        button_l.setOnClickListener(this);
        button_m = findViewById(R.id.button13);
        button_m.setOnClickListener(this);
        button_n = findViewById(R.id.button14);
        button_n.setOnClickListener(this);
        button_o = findViewById(R.id.button15);
        button_o.setOnClickListener(this);

        button_p = findViewById(R.id.button16);
        button_p.setOnClickListener(this);
        button_q = findViewById(R.id.button17);
        button_q.setOnClickListener(this);
        button_r = findViewById(R.id.button18);
        button_r.setOnClickListener(this);
        button_s = findViewById(R.id.button19);
        button_s.setOnClickListener(this);
        button_t = findViewById(R.id.button20);
        button_t.setOnClickListener(this);
        button_u = findViewById(R.id.button21);
        button_u.setOnClickListener(this);
        button_v = findViewById(R.id.button22);
        button_v.setOnClickListener(this);
        button_w = findViewById(R.id.button23);
        button_w.setOnClickListener(this);
        button_x = findViewById(R.id.button24);
        button_x.setOnClickListener(this);
        button_y = findViewById(R.id.button25);
        button_y.setOnClickListener(this);
        button_z = findViewById(R.id.button26);
        button_z.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button1) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","a");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.a);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button2) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","b");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.b);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button3) {
            Intent intent = new Intent(AlphabetActivity.this, c_alphabetActivity.class);
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.c);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button4) {
            Intent intent = new Intent(AlphabetActivity.this, d_alphabetActivity.class);
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.d);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button5) {
            Intent intent = new Intent(AlphabetActivity.this, e_alphabetActivity.class);
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.e);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button6) {
            Intent intent = new Intent(AlphabetActivity.this, f_alphabetActivity.class);
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.f);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button7) {
            Intent intent = new Intent(AlphabetActivity.this, g_alphabetActivity.class);
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.g);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button8) {
            Intent intent = new Intent(AlphabetActivity.this, h_alphabetActivity.class);
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.h);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button9) {
            Intent intent = new Intent(AlphabetActivity.this, I_alphabetActivity.class);
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.i);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button10) {
            Intent intent = new Intent(AlphabetActivity.this, j_alphabetActivity.class);
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.j);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button11) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","k");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.k);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button12) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","l");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.l);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button13) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","m");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.m);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button14) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","n");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.n);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button15) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","o");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.o);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }

        if (v.getId() == R.id.button16) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","p");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.p);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button17) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","q");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.q);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button18) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","r");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.r);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button19) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","s");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.s);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button20) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","t");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.t);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button21) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","u");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.u);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button22) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","v");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.v);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button23) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","w");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.w);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button24) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","x");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.x);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button25) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","y");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.y);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }
        if (v.getId() == R.id.button26) {
            Intent intent = new Intent(AlphabetActivity.this, A_alphabetActivity.class);
            intent.putExtra("id","z");
            startActivity(intent);
            mediaPlayer= MediaPlayer.create(this,R.raw.z);

            mediaPlayer.start();
            while (mediaPlayer.isPlaying()){

            }
            mediaPlayer.release();
        }

    }
}
