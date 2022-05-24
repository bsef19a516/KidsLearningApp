package com.example.kidslearningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Picture extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    ImageView i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        constraintLayout = new ConstraintLayout(this);
        i = (ImageView) findViewById (R.id.imageView);

        Intent intent = getIntent();
        String btn=intent.getStringExtra("btn_id");
        TextView tv=(TextView) findViewById(R.id.textView2);
        tv.setText(btn);
        switch(btn){
            case "a":
                i.setImageResource(R.drawable.apple);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "b":
                i.setImageResource(R.drawable.ball);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "c":
                i.setImageResource(R.drawable.cat);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "d":
                i.setImageResource(R.drawable.dog);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "e":
                i.setImageResource(R.drawable.eagle);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "f":
                i.setImageResource(R.drawable.flag);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "g":
                i.setImageResource(R.drawable.guitar);i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "h":
                i.setImageResource(R.drawable.helicopter);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "i":
                i.setImageResource(R.drawable.icecream);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "j":
                i.setImageResource(R.drawable.jeep);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "k":
                i.setImageResource(R.drawable.kangroo);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "l":
                i.setImageResource(R.drawable.lion);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "m":
                i.setImageResource(R.drawable.mango);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "n":
                i.setImageResource(R.drawable.net);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "o":
                i.setImageResource(R.drawable.octopus);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "p":
                i.setImageResource(R.drawable.pencil);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "q":
                i.setImageResource(R.drawable.queen);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "r":
                i.setImageResource(R.drawable.rainbow);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "s":
                i.setImageResource(R.drawable.sun);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "t":
                i.setImageResource(R.drawable.train);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "u":
                i.setImageResource(R.drawable.umbrella);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "v":
                i.setImageResource(R.drawable.vase);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "w":
                i.setImageResource(R.drawable.wolf);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "x":
                i.setImageResource(R.drawable.xylophone);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "y":
                i.setImageResource(R.drawable.yacht);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
            case "z":
                i.setImageResource(R.drawable.zebra);
                i.setAdjustViewBounds(true);
                i.setLayoutParams(new Gallery.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT));
                break;
        }

    }

}
