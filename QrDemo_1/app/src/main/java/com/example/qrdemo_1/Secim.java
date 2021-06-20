package com.example.qrdemo_1;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Secim extends AppCompatActivity {

    EditText edtmasa, edtisim;
    Button btnAnasayfa;
    DatabaseReference reff;
    customer Customer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secim);

        //tanımalar

        edtisim=findViewById(R.id.edtisim);
        edtmasa=findViewById(R.id.edtmasa);
        btnAnasayfa=findViewById(R.id.btnAnasayfa);

        Customer=new customer();


        //database erişimi
        reff= FirebaseDatabase.getInstance().getReference().child("customer");


        btnAnasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Restoranımıza hoşgeldin  "+edtisim.getText().toString(),Toast.LENGTH_LONG).show();
                Intent anasayfayagec=new Intent(Secim.this,AnaEkran.class);
                startActivity(anasayfayagec);
                //integer to string



            }
        });







    }
}