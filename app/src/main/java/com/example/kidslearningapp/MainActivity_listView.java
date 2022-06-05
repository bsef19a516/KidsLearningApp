package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity_listView extends AppCompatActivity implements View.OnClickListener  {
    Button gh, l, t, listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_listview);
        l = (Button) findViewById(R.id.learn_listView);
        t = (Button) findViewById(R.id.test);
        gh = (Button) findViewById(R.id.github);
        listView = (Button) findViewById(R.id.listView);

        l.setOnClickListener(this);
        t.setOnClickListener(this);
        gh.setOnClickListener(this);
        listView.setOnClickListener(this);

    }
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.learn_listView:
                Intent i = new Intent(this,ListViewAlphabet.class);
                startActivity(i);
                break;
            case R.id.test:
                Intent intent1 = new Intent(this, Test.class);
                startActivity(intent1);
                break;
            case R.id.github:
                openWebPage();
                break;
            case R.id.listView:
                Intent intent2 = new Intent(this, MainActivity.class);
                startActivity(intent2);
                finish();
                break;
        }
    }
    public void openWebPage() {
        Uri webpage = Uri.parse("https://github.com/bsef19a516/KidsLearningApp");
        Intent intent = new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(intent);
    }
}
