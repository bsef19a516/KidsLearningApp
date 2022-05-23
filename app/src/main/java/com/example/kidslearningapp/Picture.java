package com.example.kidslearningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;

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
        i = new ImageView(this);

        Intent intent = getIntent();
        int btn_id=intent.getIntExtra("btn_ID", 0);
        switch(btn_id) {
            case 97:
                setImage();
                break;
            case 98:
                setImage();
                break;

        }
    }
    private void setImage(){
        i.setImageResource(R.drawable.ball);

        i.setAdjustViewBounds(true);
        i.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        // Add the ImageView to the layout and set the layout as the content view.
        constraintLayout.addView(i);
        setContentView(constraintLayout);
    }
}
