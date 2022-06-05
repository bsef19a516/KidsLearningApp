package com.example.kidslearningapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ListViewQuestionAdaptor extends ArrayAdapter<ListViewTest> {
    public ListViewQuestionAdaptor(@NonNull Context context, @NonNull ArrayList<ListViewTest> questionsArrayList) {
        super(context,0, questionsArrayList);
    }
    public static ArrayList<String> selectedAnswers;
    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ListViewTest questions = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_test_listview, parent, false);
        ImageView imageView = convertView.findViewById(R.id.imageView4);
        RadioButton alpha = (RadioButton) convertView.findViewById(R.id.alpha);
        RadioButton beta = (RadioButton) convertView.findViewById(R.id.beta);
        RadioButton gemma = (RadioButton) convertView.findViewById(R.id.gemma);
        selectedAnswers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            selectedAnswers.add("Not Attempted");
        }
// perform setOnCheckedChangeListener event on yes button
        alpha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
// set Yes values in ArrayList if RadioButton is checked
                if (isChecked)
                    selectedAnswers.set(position, "Yes");

            }
        });
// perform setOnCheckedChangeListener event on no button
        beta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
// set No values in ArrayList if RadioButton is checked
                if (isChecked)
                    selectedAnswers.set(position, "No");

            }
        });
        gemma.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
// set No values in ArrayList if RadioButton is checked
                if (isChecked)
                selectedAnswers.set(position, "No");

            }
        });
        imageView.setImageResource(questions.imgId);
        return convertView;
    }
}
