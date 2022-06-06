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
        studentArrayList.add(new ListViewLearn("Aa",  R.drawable.apple, "Apple"));
        studentArrayList.add(new ListViewLearn("Bb", R.drawable.ball, "Ball"));
        studentArrayList.add(new ListViewLearn("Cc",  R.drawable.cat,"Cat"));
        studentArrayList.add(new ListViewLearn("Dd", R.drawable.dog,"Dog"));
        studentArrayList.add(new ListViewLearn("Ee",  R.drawable.eagle,"Eagle"));
        studentArrayList.add(new ListViewLearn("Ff", R.drawable.flag,"Flag"));
        studentArrayList.add(new ListViewLearn("Gg",  R.drawable.guitar,"Guitar"));
        studentArrayList.add(new ListViewLearn("Hh", R.drawable.helicopter,"Helicopter"));
        studentArrayList.add(new ListViewLearn("Ii",  R.drawable.icecream,"Ice Cream"));
        studentArrayList.add(new ListViewLearn("Jj", R.drawable.jeep,"Jeep"));
        studentArrayList.add(new ListViewLearn("Kk",  R.drawable.kangroo,"Kangaroo"));
        studentArrayList.add(new ListViewLearn("Ll", R.drawable.lion,"Lion"));
        studentArrayList.add(new ListViewLearn("Mm",  R.drawable.mango,"Mango"));
        studentArrayList.add(new ListViewLearn("Nn", R.drawable.net,"Net"));
        studentArrayList.add(new ListViewLearn("Oo",  R.drawable.octopus,"Octopus"));
        studentArrayList.add(new ListViewLearn("Pp", R.drawable.pencil,"Pencil"));
        studentArrayList.add(new ListViewLearn("Qq",  R.drawable.queen,"Queen"));
        studentArrayList.add(new ListViewLearn("Rr", R.drawable.rainbow,"Rainbow"));
        studentArrayList.add(new ListViewLearn("Ss",  R.drawable.sun,"Sun"));
        studentArrayList.add(new ListViewLearn("Tt", R.drawable.train,"Train"));
        studentArrayList.add(new ListViewLearn("Uu",  R.drawable.umbrella,"Umbrella"));
        studentArrayList.add(new ListViewLearn("Vv", R.drawable.vase,"Vase"));
        studentArrayList.add(new ListViewLearn("Ww",  R.drawable.wolf,"Wolf"));
        studentArrayList.add(new ListViewLearn("Xx", R.drawable.xylophone,"Xylophone"));
        studentArrayList.add(new ListViewLearn("Yy",  R.drawable.yacht,"Yacht"));
        studentArrayList.add(new ListViewLearn("Zz", R.drawable.zebra,"Zebra"));
        ListViewLearnAdaptor adapter = new ListViewLearnAdaptor(getApplicationContext(), studentArrayList);
        ListView listView = findViewById(R.id.listView2);
        listView.setAdapter(adapter);
    }
}

