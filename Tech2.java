package com.example.vidhya.melange;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Tech2 extends AppCompatActivity {
    TextView tv,tv2,tv3,tv4,tv5,tv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech2);
        tv=(TextView)findViewById(R.id.t1);
        Typeface face=Typeface.createFromAsset(getAssets(), "fonts/quad.ttf");
        tv.setTypeface(face);
        tv3=(TextView)findViewById(R.id.t3);
        Typeface face3=Typeface.createFromAsset(getAssets(), "fonts/quad.ttf");
        tv3.setTypeface(face3);
        tv4=(TextView)findViewById(R.id.t5);
        Typeface face4=Typeface.createFromAsset(getAssets(), "fonts/quad.ttf");
        tv4.setTypeface(face4);
        tv2=(TextView)findViewById(R.id.t2);
        Typeface face2=Typeface.createFromAsset(getAssets(), "fonts/april.ttf");
        tv2.setTypeface(face2);
        tv5=(TextView)findViewById(R.id.t4);
        Typeface face5=Typeface.createFromAsset(getAssets(), "fonts/april.ttf");
        tv5.setTypeface(face5);
        tv6=(TextView)findViewById(R.id.t6);
        Typeface face6=Typeface.createFromAsset(getAssets(), "fonts/april.ttf");
        tv6.setTypeface(face6);

    }
}