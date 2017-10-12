package com.example.vidhya.melange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Lectures extends AppCompatActivity {
    Button b,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectures);
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Lectures.this,Registerl.class);
                startActivity(intent);
            }
        } );
        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Lectures.this,Registerl.class);
                startActivity(intent);
            }
        } );
    }
}
