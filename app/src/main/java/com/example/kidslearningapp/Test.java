package com.example.kidslearningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Random;

public class Test extends AppCompatActivity implements View.OnClickListener{
    Random rnd;
    int random;
    ImageView i;
    Button next, submit;
    EditText input;
    int score=0, counter=0;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        rnd=new Random();
        i=(ImageView) findViewById(R.id.imageView2);
        next=(Button) findViewById(R.id.next);
        submit=(Button) findViewById(R.id.submit);
        input=(EditText) findViewById(R.id.input);

        random = rnd.nextInt(26);
        i.setImageResource(drawables[random]);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(1000, 1000);
        i.setLayoutParams(layoutParams);
        next.setOnClickListener(this);
        submit.setOnClickListener(this);
    }

    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.submit:
                String em = input.getText().toString();
                char c= (char)(random+97);
                String str= String.valueOf(c);
                if (input.getText().length() > 0) {
                    if (em.equalsIgnoreCase(str) ) {
                        rnd = new Random();
                        random = rnd.nextInt(26);
                        i.setImageResource(drawables[random]);
                        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(1000, 1000);
                        i.setLayoutParams(layoutParams);
                        input.getText().clear();
                        score++;
                        counter++;
                        if (counter == 5) {
                            Intent intent = new Intent(this, Score.class);
                            intent.putExtra("score", score);
                            startActivity(intent);
                            finish();
                        }

                    } else {
                        Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Answer is empty", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.next:
                rnd = new Random();
                random = rnd.nextInt(26);
                i.setImageResource(drawables[random]);
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(1000, 1000);
                i.setLayoutParams(layoutParams);
                input.getText().clear();
                counter++;
                if (counter == 5) {
                    Intent intent = new Intent(this, Score.class);
                    intent.putExtra("score", score);
                    intent.putExtra("Total", 50);
                    startActivity(intent);

            }
        }
    }
}
