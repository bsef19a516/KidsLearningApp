package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    Button gh, l, t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = (Button) findViewById(R.id.learn);
        t = (Button) findViewById(R.id.test);
        gh = (Button) findViewById(R.id.github);

        l.setOnClickListener(this);
        t.setOnClickListener(this);
        gh.setOnClickListener(this);

    }
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.learn:
                Intent i = new Intent(this,Learn.class);
                startActivity(i);
                break;
            case R.id.test:
                Intent intent1 = new Intent(this, Test.class);
                startActivity(intent1);
                break;
            case R.id.github:
                openWebPage();
                break;
        }
    }
    public void openWebPage() {
        Uri webpage = Uri.parse("https://github.com/bsef19a516");
        Intent intent = new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(intent);
    }
}
