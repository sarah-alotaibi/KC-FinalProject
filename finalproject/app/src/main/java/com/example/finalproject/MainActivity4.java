package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ArrayList<Uni90> items = new ArrayList<>();
                Uni90 uni901 =new Uni90("AUK",R.drawable.auk);
                Uni90 uni902 = new Uni90("KU",R.drawable.ku);
                Uni90 uni903 = new Uni90("KMBS",R.drawable.kmbs);

                items.add(uni901);
                items.add(uni902);
                items.add(uni903);

        ListView listView2 = findViewById(R.id.listview2);
                UniAdapter2 uniAdapter2 = new UniAdapter2(this , 0 ,items);
                listView2.setAdapter(uniAdapter2);




    }
}