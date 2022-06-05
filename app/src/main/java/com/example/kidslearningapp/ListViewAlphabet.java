package com.example.kidslearningapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListViewAlphabet extends AppCompatActivity {
    ListView listView;
    public static ArrayList<ListViewLearn> studentArrayList = new ArrayList<ListViewLearn>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_listview);
        studentArrayList.add(new ListViewLearn("Aa",  R.drawable.apple));
        studentArrayList.add(new ListViewLearn("Saad", R.drawable.ball));
        studentArrayList.add(new ListViewLearn("Ali",  R.drawable.cat));
        studentArrayList.add(new ListViewLearn("Saad", R.drawable.dog));
        studentArrayList.add(new ListViewLearn("Ali",  R.drawable.eagle));
        studentArrayList.add(new ListViewLearn("Saad", R.drawable.flag));
        studentArrayList.add(new ListViewLearn("Ali",  R.drawable.guitar));
        studentArrayList.add(new ListViewLearn("Saad", R.drawable.helicopter));
        studentArrayList.add(new ListViewLearn("Ali",  R.drawable.icecream));
        studentArrayList.add(new ListViewLearn("Saad", R.drawable.jeep));
        studentArrayList.add(new ListViewLearn("Ali",  R.drawable.kangroo));
        studentArrayList.add(new ListViewLearn("Saad", R.drawable.lion));
        studentArrayList.add(new ListViewLearn("Ali",  R.drawable.mango));
        studentArrayList.add(new ListViewLearn("Saad", R.drawable.net));
        studentArrayList.add(new ListViewLearn("Ali",  R.drawable.octopus));
        studentArrayList.add(new ListViewLearn("Saad", R.drawable.pencil));
        studentArrayList.add(new ListViewLearn("Ali",  R.drawable.queen));
        studentArrayList.add(new ListViewLearn("Saad", R.drawable.rainbow));
        studentArrayList.add(new ListViewLearn("Ali",  R.drawable.sun));
        studentArrayList.add(new ListViewLearn("Saad", R.drawable.train));
        studentArrayList.add(new ListViewLearn("Ali",  R.drawable.umbrella));
        studentArrayList.add(new ListViewLearn("Saad", R.drawable.vase));
        studentArrayList.add(new ListViewLearn("Ali",  R.drawable.wolf));
        studentArrayList.add(new ListViewLearn("Saad", R.drawable.xylophone));
        studentArrayList.add(new ListViewLearn("Ali",  R.drawable.yacht));
        studentArrayList.add(new ListViewLearn("Saad", R.drawable.zebra));
        ListViewLearnAdaptor adapter = new ListViewLearnAdaptor(getApplicationContext(), studentArrayList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}

