package com.example.vidhya.melange;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Flash extends AppCompatActivity {
    Button b,b2,b3,b4,b5,b6,b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Flash.this,Tech1.class);
                startActivity(intent);
            }
        } );
        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Flash.this,Tech2.class);
                startActivity(intent);
            }
        } );
        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Flash.this,Tech3.class);
                startActivity(intent);
            }
        } );
        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Flash.this,Tech4.class);
                startActivity(intent);
            }
        } );
        b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Flash.this,Nontech1.class);
                startActivity(intent);
            }
        } );
        b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Flash.this,Nontech2.class);
                startActivity(intent);
            }
        } );
        b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Flash.this,Nontech3.class);
                startActivity(intent);
            }
        } );
    }
}
