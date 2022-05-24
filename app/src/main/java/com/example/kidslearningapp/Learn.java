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

    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;

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

        a=(Button)findViewById(R.id.a);
        b=(Button)findViewById(R.id.b);
        c=(Button)findViewById(R.id.c);
        d=(Button)findViewById(R.id.d);
        e=(Button)findViewById(R.id.e);
        f=(Button)findViewById(R.id.f);
        g=(Button)findViewById(R.id.g);
        h=(Button)findViewById(R.id.h);
        i=(Button)findViewById(R.id.i);
        j=(Button)findViewById(R.id.j);
        k=(Button)findViewById(R.id.k);
        l=(Button)findViewById(R.id.l);
        m=(Button)findViewById(R.id.m);
        n=(Button)findViewById(R.id.n);
        o=(Button)findViewById(R.id.o);
        p=(Button)findViewById(R.id.p);
        q=(Button)findViewById(R.id.q);
        r=(Button)findViewById(R.id.r);
        s=(Button)findViewById(R.id.s);
        t=(Button)findViewById(R.id.t);
        u=(Button)findViewById(R.id.u);
        v=(Button)findViewById(R.id.v);
        w=(Button)findViewById(R.id.w);
        x=(Button)findViewById(R.id.x);
        y=(Button)findViewById(R.id.y);
        z=(Button)findViewById(R.id.z);

        for(int id : BUTTON_IDS) {
            Button button = (Button)findViewById(id);
            button.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent= new Intent(this, Picture.class);
        switch(view.getId()){
            case R.id.a:
                intent.putExtra("btn_id", "a");
                break;
            case R.id.b:
                intent.putExtra("btn_id", "b");
                break;
            case R.id.c:
                intent.putExtra("btn_id", "c");
                break;
            case R.id.d:
                intent.putExtra("btn_id", "d");
                break;
            case R.id.e:
                intent.putExtra("btn_id", "e");
                break;
            case R.id.f:
                intent.putExtra("btn_id", "f");
                break;
            case R.id.g:
                intent.putExtra("btn_id", "g");
                break;
            case R.id.h:
                intent.putExtra("btn_id", "h");
                break;
            case R.id.i:
                intent.putExtra("btn_id", "i");
                break;
            case R.id.j:
                intent.putExtra("btn_id", "j");
                break;
            case R.id.k:
                intent.putExtra("btn_id", "k");
                break;
            case R.id.l:
                intent.putExtra("btn_id", "l");
                break;
            case R.id.m:
                intent.putExtra("btn_id", "m");
                break;
            case R.id.n:
                intent.putExtra("btn_id", "n");
                break;
            case R.id.o:
                intent.putExtra("btn_id", "o");
                break;
            case R.id.p:
                intent.putExtra("btn_id", "p");
                break;
            case R.id.q:
                intent.putExtra("btn_id", "q");
                break;
            case R.id.r:
                intent.putExtra("btn_id", "r");
                break;
            case R.id.s:
                intent.putExtra("btn_id", "s");
                break;
            case R.id.t:
                intent.putExtra("btn_id", "t");
                break;
            case R.id.u:
                intent.putExtra("btn_id", "u");
                break;
            case R.id.v:
                intent.putExtra("btn_id", "v");
                break;
            case R.id.w:
                intent.putExtra("btn_id", "w");
                break;
            case R.id.x:
                intent.putExtra("btn_id", "x");
                break;
            case R.id.y:
                intent.putExtra("btn_id", "y");
                break;
            case R.id.z:
                intent.putExtra("btn_id", "z");
                break;
        }

        startActivity(intent);
    }
}
