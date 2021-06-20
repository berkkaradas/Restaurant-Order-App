package com.example.qrdemo_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AnaEkran extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference myRef,myRef1;

    ImageButton scannerbutton,btnMenu;
    Button btnOyla;
    private Object View;
    Switch waiterbutton1,check1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_ekran);

        // Write a message to the database
        database= FirebaseDatabase.getInstance();
        myRef= database.getReference("led");
        myRef1=database.getReference("led1");



        //buton tanımları

        scannerbutton=(ImageButton) findViewById(R.id.scannerbutton);
        btnMenu=findViewById(R.id.btnMenu);
        btnOyla=findViewById(R.id.btnOyla);
        waiterbutton1=findViewById(R.id.waiterbutton1);
        check1=findViewById(R.id.check1);

        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean a) {

                if(a){
                    myRef1.setValue(1);

                }
                else {
                    myRef1.setValue(0);
                }

            }
        });

        waiterbutton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    myRef.setValue(1);

                }
                else {
                    myRef.setValue(0);
                }
            }
        });



        scannerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ScanCodeActivity.class));


            }
        });

        //Menüye geçiş butonu
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuyeGec=new Intent(AnaEkran.this,Menu1.class);
                startActivity(menuyeGec);


            }
        });
        btnOyla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                Intent OyaGec=new Intent(AnaEkran.this,Oyla.class);
                startActivity(OyaGec);
            }
        });



    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu1,menu);
        return true;
    }
    //menu select kodları


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.vote:
                Intent OyaGec=new Intent(AnaEkran.this,Oyla.class);
                startActivity(OyaGec);
                break;
            case R.id.exit:
                System.exit(0);
                break;


        }
        return super.onOptionsItemSelected(item);
    }

}