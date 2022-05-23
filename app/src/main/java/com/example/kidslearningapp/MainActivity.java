package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    Button github;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        github = (Button) findViewById(R.id.github);
        github.setOnClickListener(this);

    }
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.github:
                openWebPage();
                break;
            case R.id.learn:
                Intent in = new Intent(this, Learn.class);
                startActivity(in);
                break;
            case R.id.test:
                Intent intent1 = new Intent(this, Test.class);
                startActivity(intent1);
                break;

        }
    }
    public void openWebPage() {
        Uri webpage = Uri.parse("https://github.com/bsef19a516");
        Intent intent = new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(intent);
    }
}
