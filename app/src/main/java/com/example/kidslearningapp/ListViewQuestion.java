package com.example.kidslearningapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class ListViewQuestion extends AppCompatActivity {
    int score;
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

        int[] ans ={random.nextInt(26),random.nextInt(26),random.nextInt(26),random.nextInt(26),random.nextInt(26),};
        int[] rnd1={random.nextInt(26),random.nextInt(26),random.nextInt(26),random.nextInt(26),random.nextInt(26),};
        int[] rnd2={random.nextInt(26),random.nextInt(26),random.nextInt(26),random.nextInt(26),random.nextInt(26),};

        imagesArrayList.add(new ListViewTest(answers[rnd1[0]],answers[ans[0]],answers[rnd2[0]], drawables[ans[0]]));
        imagesArrayList.add(new ListViewTest(answers[ans[1]],answers[rnd1[1]],answers[rnd2[1]], drawables[ans[1]]));
        imagesArrayList.add(new ListViewTest(answers[rnd2[2]],answers[ans[2]],answers[rnd1[2]],  drawables[ans[2]]));
        //imagesArrayList.add(new ListViewTest(answers[rnd2[3]],answers[rnd1[3]],answers[ans[3]], drawables[ans[3]]));
        //imagesArrayList.add(new ListViewTest(answers[ans[4]],answers[rnd2[4]],answers[rnd1[4]],  drawables[ans[4]]));
        ListViewQuestionAdaptor adapter = new ListViewQuestionAdaptor(getApplicationContext(), imagesArrayList);
        ListView listView = findViewById(R.id.listView2);
        listView.setAdapter(adapter);

        Button submit=findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < ListViewQuestionAdaptor.selectedAnswers.size(); i++) {
                    if (answers[ans[i]].equals(ListViewQuestionAdaptor.selectedAnswers.get(i)))
                    {
                        Log.d("correct answer",ListViewQuestionAdaptor.selectedAnswers.get(i));
                        score++;
                    }
                    else
                    {
                        Log.d("wrong answer ",ListViewQuestionAdaptor.selectedAnswers.get(i));
                    }
                }
                Intent intent = new Intent(getApplicationContext(), Score.class);
                intent.putExtra("score", score);
                intent.putExtra("Total", 30);
                startActivity(intent);
            }
        });
    }
}
