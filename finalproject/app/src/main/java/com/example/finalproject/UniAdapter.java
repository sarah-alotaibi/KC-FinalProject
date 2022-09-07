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

public class UniAdapter extends ArrayAdapter {
    List<Uni80>uni80List;
    public UniAdapter(@NonNull Context context, int resource, @NonNull List<Uni80> objects) {
        super(context, resource, objects);
        uni80List = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.uni80row,parent,false);
        Uni80 currentUni = uni80List.get(position);

        TextView textView = view.findViewById(R.id.uniname);
        ImageView imageView = view.findViewById(R.id.uniImage);

        textView.setText(currentUni.getUniName());
        imageView.setImageResource(currentUni.getUniImage());
        return view;

    }
}
