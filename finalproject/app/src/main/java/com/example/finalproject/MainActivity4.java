package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
                Uni90 uni901 =new Uni90("AUK",R.drawable.auk);
                Uni90 uni902 = new Uni90("KU",R.drawable.ku);
                Uni90 uni90 = new Uni90("KMBS",R.drawable.kmbs);


                UniAdapter2 uniAdapter2 = new UniAdapter2(this , 0 );




    }
}