package com.example.kidslearningapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        String[] answers= {
                "apple",
                "ball",
                "cat",
                "dog",
                "eagle",
                "flag",
                "guitar",
                "helicopter",
                "icecream",
                "jeep",
                "kangroo",
                "lion",
                "mango",
                "net",
                "octopus",
                "pencil",
                "queen",
                "rainbow",
                "sun",
                "train",
                "umbrella",
                "vase",
                "wolf",
                "xylophone",
                "yacht",
                "zebra",
        };

        int rnd=random.nextInt(26);
        int rnd1=random.nextInt(26);
        int rnd2=random.nextInt(26);
        int rnd3=random.nextInt(26);
        int rnd4=random.nextInt(26);
        imagesArrayList.add(new ListViewTest(answers[rnd], drawables[rnd]));
        imagesArrayList.add(new ListViewTest(answers[rnd1], drawables[rnd1]));
        imagesArrayList.add(new ListViewTest(answers[rnd2],  drawables[rnd2]));
        imagesArrayList.add(new ListViewTest(answers[rnd3], drawables[rnd3]));
        imagesArrayList.add(new ListViewTest(answers[rnd4],  drawables[rnd4]));
        ListViewQuestionAdaptor adapter = new ListViewQuestionAdaptor(getApplicationContext(), imagesArrayList);
        ListView listView = findViewById(R.id.listView2);
        listView.setAdapter(adapter);

        Button submit=findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

    }
}
