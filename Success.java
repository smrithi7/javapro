package com.example.vidhya.melange;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class Success extends AppCompatActivity {
    TextView txtV;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        txtV=(TextView)findViewById(R.id.textView8);
        Typeface face=Typeface.createFromAsset(getAssets(), "fonts/jean.ttf");
        txtV.setTypeface(face);
        b=(Button) findViewById(R.id.btn2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Success.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

