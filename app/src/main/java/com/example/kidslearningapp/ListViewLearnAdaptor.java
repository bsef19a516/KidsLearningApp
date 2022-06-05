package com.example.kidslearningapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;


public class ListViewLearnAdaptor extends ArrayAdapter<ListViewLearn> {

    public ListViewLearnAdaptor(@NonNull Context context, ArrayList<ListViewLearn> alphabetArrayList) {
        super(context, 0, alphabetArrayList);
    }
    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ListViewLearn alphabets = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_alphabet_listview, parent, false);
        TextView textViewName = convertView.findViewById(R.id.textView3);
        ImageView imageView = convertView.findViewById(R.id.imageView3);
        textViewName.setText(alphabets.alphabet);
        imageView.setImageResource(alphabets.imgId);
        return convertView;
    }
}
