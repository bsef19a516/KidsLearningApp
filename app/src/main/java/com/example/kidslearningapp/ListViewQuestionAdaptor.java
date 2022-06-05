package com.example.kidslearningapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ListViewQuestionAdaptor extends ArrayAdapter<ListViewTest> {
    public ListViewQuestionAdaptor(@NonNull Context context, @NonNull ArrayList<ListViewTest> questionsArrayList) {
        super(context,0, questionsArrayList);
    }
    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ListViewTest questions = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_alphabet_listview, parent, false);
        EditText answer = convertView.findViewById(R.id.answer);
        ImageView imageView = convertView.findViewById(R.id.imageView4);
        answer.setText(questions.question);
        imageView.setImageResource(questions.imgId);
        return convertView;
    }
}
