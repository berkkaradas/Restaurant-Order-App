package com.example.qrdemo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Oyla extends AppCompatActivity {

    RatingBar Rate1;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyla);
        Rate1 =findViewById(R.id.Rate1);
        btnSubmit=findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bizi oyladığınız için teşekkür ederiz.",Toast.LENGTH_LONG).show();
            }
        });
    }


    }
