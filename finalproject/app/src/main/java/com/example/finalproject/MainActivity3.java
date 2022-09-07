package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    ArrayList<Uni80> items = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Uni80 uni801 =new Uni80("GUST",R.drawable.gust);
        Uni80 uni802 = new Uni80("Aum",R.drawable.aum);
        Uni80 uni803 = new Uni80("AU",R.drawable.au);

        items.add(uni801);
        items.add(uni802);
        items.add(uni803);


        ListView listView = findViewById(R.id.listView);


        UniAdapter uniAdapter = new UniAdapter(this, 0,items);
        listView.setAdapter(uniAdapter);



    }
}