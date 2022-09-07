package com.example.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class UniAdapter2 extends ArrayAdapter {
    List<Uni90> uni90List;
    public UniAdapter2(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        uni90List = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.uni90row,parent,false);
        Uni90 currentUni90 = uni90List.get(position);

        TextView textView = view.findViewById(R.id.Uniname2);
        ImageView imageView = view.findViewById(R.id.uniImage1);

        textView.setText(currentUni90.getUniName());
        imageView.setImageResource(currentUni90.getUniImage());
        return view;
    }

}


