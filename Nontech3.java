package com.example.vidhya.melange;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Nontech3 extends AppCompatActivity {
    TextView tv,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nontech3);
        tv=(TextView)findViewById(R.id.t1);
        Typeface face=Typeface.createFromAsset(getAssets(), "fonts/sipp.ttf");
        tv.setTypeface(face);
        tv2=(TextView)findViewById(R.id.t2);
        Typeface face2=Typeface.createFromAsset(getAssets(), "fonts/beauti.ttf");
        tv2.setTypeface(face2);
        tv3=(TextView)findViewById(R.id.t3);
        Typeface face3=Typeface.createFromAsset(getAssets(), "fonts/sipp.ttf");
        tv3.setTypeface(face3);
        tv4=(TextView)findViewById(R.id.t4);
        Typeface face4=Typeface.createFromAsset(getAssets(), "fonts/beauti.ttf");
        tv4.setTypeface(face4);
    }
}
