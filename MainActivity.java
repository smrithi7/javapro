package com.example.vidhya.melange;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    ImageButton img,img2, img3, img4,img5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageButton) findViewById(R.id.i1);
        img2 = (ImageButton) findViewById(R.id.i2);
        img3 = (ImageButton) findViewById(R.id.i3);
        img4 = (ImageButton) findViewById(R.id.i4);
        img5 = (ImageButton) findViewById(R.id.i5);
        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                func();
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                func2();
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                func3();
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                func4();
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                func5();
            }
        });
    }

    public void func() {
        Intent in1 = new Intent(MainActivity.this, Paper.class);
        startActivity(in1);
    }
    public void func2() {
        Intent in2 = new Intent(MainActivity.this, Lectures.class);
        startActivity(in2);
    }
    public void func3() {
        Intent in3 = new Intent(MainActivity.this, Flash.class);
        startActivity(in3);
    }
    public void func4() {
        Intent in4 = new Intent(MainActivity.this, About.class);
        startActivity(in4);
    }
    public void func5() {
        Intent in1 = new Intent(MainActivity.this, Symp.class);
        startActivity(in1);
    }
}

