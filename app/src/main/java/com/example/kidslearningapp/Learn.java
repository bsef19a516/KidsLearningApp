package com.example.kidslearningapp;

import static com.example.kidslearningapp.R.layout.activity_learn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Learn extends AppCompatActivity implements View.OnClickListener{

    private List<Button> buttons;
    private static final int[] BUTTON_IDS = {
            R.id.a,
            R.id.b,
            R.id.c,
            R.id.d,
            R.id.e,
            R.id.f,
            R.id.g,
            R.id.h,
            R.id.i,
            R.id.j,
            R.id.k,
            R.id.l,
            R.id.m,
            R.id.n,
            R.id.o,
            R.id.p,
            R.id.q,
            R.id.r,
            R.id.s,
            R.id.t,
            R.id.u,
            R.id.v,
            R.id.w,
            R.id.x,
            R.id.y,
            R.id.z,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_learn);

        for(int id : BUTTON_IDS) {
            Button button = (Button)findViewById(id);
            button.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent= new Intent(this, Picture.class);
        intent.putExtra("btn_ID", view.getId());
        startActivity(intent);
    }
}
