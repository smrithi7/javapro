package com.example.vidhya.melange;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Paper extends AppCompatActivity {
    Button b;
    TextView tv,tv1,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper);
        b = (Button) findViewById(R.id.btn1);
        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Paper.this,Registerp.class);
                startActivity(intent);

            }
        } );

        tv=(TextView)findViewById(R.id.textView6);
        Typeface face=Typeface.createFromAsset(getAssets(), "fonts/hab.ttf");
        tv.setTypeface(face);
        tv1=(TextView)findViewById(R.id.textView9);
        Typeface face1=Typeface.createFromAsset(getAssets(), "fonts/hab.ttf");
        tv1.setTypeface(face1);
        tv3=(TextView)findViewById(R.id.txt1);
        Typeface face2=Typeface.createFromAsset(getAssets(), "fonts/sipp.ttf");
        tv3.setTypeface(face2);
    }
}
