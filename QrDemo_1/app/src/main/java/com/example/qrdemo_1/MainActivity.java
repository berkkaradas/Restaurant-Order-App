package com.example.qrdemo_1;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView HosgeldinYazi;
    private ImageView HosgeldinGorsel;
    private static int GECİS_SURESİ=4000;
    ConstraintLayout back1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tanımlar
        HosgeldinYazi=(TextView)findViewById(R.id.HosgeldinYazi);
        HosgeldinGorsel=(ImageView)findViewById(R.id.HosgeldinGorsel);
        back1=(ConstraintLayout) findViewById(R.id.back1);
        //ANİMASYON
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim1);
        HosgeldinYazi.startAnimation(animation);
        HosgeldinGorsel.startAnimation(animation);
        //gecis
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gecis =new Intent(MainActivity.this,Secim.class);
                startActivity(gecis);
                finish();
            }
        },GECİS_SURESİ);










    }

}