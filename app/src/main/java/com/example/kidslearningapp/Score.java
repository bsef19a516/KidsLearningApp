package com.example.kidslearningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Score extends AppCompatActivity implements View.OnClickListener {
    Button button;
    TextView textView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        button=(Button) findViewById(R.id.button2);
        button.setOnClickListener(this);
        Intent intent=getIntent();
        int score=intent.getIntExtra("score", 0);
        textView=(TextView) findViewById(R.id.textView);
        textView.setText("Your score is: " +(score*10)+ "/50");
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
