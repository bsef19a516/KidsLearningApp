package com.example.kidslearningapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class ListViewQuestion extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_listview);
        ArrayList<ListViewTest> imagesArrayList = new ArrayList<ListViewTest>();
        Random random= new Random();
        int[] drawables= {
                R.drawable.apple,
                R.drawable.ball,
                R.drawable.cat,
                R.drawable.dog,
                R.drawable.eagle,
                R.drawable.flag,
                R.drawable.guitar,
                R.drawable.helicopter,
                R.drawable.icecream,
                R.drawable.jeep,
                R.drawable.kangroo,
                R.drawable.lion,
                R.drawable.mango,
                R.drawable.net,
                R.drawable.octopus,
                R.drawable.pencil,
                R.drawable.queen,
                R.drawable.rainbow,
                R.drawable.sun,
                R.drawable.train,
                R.drawable.umbrella,
                R.drawable.vase,
                R.drawable.wolf,
                R.drawable.xylophone,
                R.drawable.yacht,
                R.drawable.zebra,
        };
        int rnd=random.nextInt(26);
        imagesArrayList.add(new ListViewTest("Apple", drawables[rnd]));
        imagesArrayList.add(new ListViewTest("Ball", drawables[random.nextInt(26)]));
        imagesArrayList.add(new ListViewTest("Cat",  drawables[random.nextInt(26)]));
        imagesArrayList.add(new ListViewTest("Dog", drawables[random.nextInt(26)]));
        imagesArrayList.add(new ListViewTest("Eagle",  drawables[rnd]));
        ListViewQuestionAdaptor adapter = new ListViewQuestionAdaptor(getApplicationContext(), imagesArrayList);
        ListView listView = findViewById(R.id.listView2);
        listView.setAdapter(adapter);

    }
}
