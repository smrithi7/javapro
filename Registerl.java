package com.example.vidhya.melange;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;


public class Registerl extends AppCompatActivity implements View.OnClickListener {

    EditText t1,t2,t3,t4,t5;
    String s1,s2,s3,s4,s5;
    Button b;
    int r5;
    Sysone e;
    private AwesomeValidation awesomeValidation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerl);
        t1 = (EditText) findViewById(R.id.txt);
        t2 = (EditText) findViewById(R.id.txt2);
        t3 = (EditText) findViewById(R.id.txt3);
        t4 = (EditText) findViewById(R.id.txt4);
        t5 = (EditText) findViewById(R.id.txt5);
        b = (Button) findViewById(R.id.button);
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        awesomeValidation.addValidation(this, R.id.txt, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.nameerror);
        awesomeValidation.addValidation(this, R.id.txt2, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.clgerror);
        awesomeValidation.addValidation(this, R.id.txt3, Patterns.EMAIL_ADDRESS, R.string.emailerror);
        awesomeValidation.addValidation(this, R.id.txt4, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.depterror);
        awesomeValidation.addValidation(this, R.id.txt5, "^[0-9]*\\d{10}$", R.string.mobileerror);
        b.setOnClickListener(this);
    }
            @Override
            public void onClick(View view) {
                if (view == b) {
                    if (awesomeValidation.validate()) {
                        // e = new com.example.vidhya.melange.Sys(Registerp.this, "tab", null, 1);
                        // e.connect();
                        // e.add(s1,s2,s3,s4,r5);
                        Submit();
                        Toast.makeText(Registerl.this, "submitted successfully", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Registerl.this, Success.class);
                        startActivity(intent);
                    }
                }
            }
    public  void Submit()
    {
        s1 = t1.getText().toString();
        s2 = t2.getText().toString();
        s3 = t3.getText().toString();
        s4 = t4.getText().toString();
        s5=t5.getText().toString();
        StringBuffer sb = new StringBuffer(s1);
        sb.append("\n" + s2);
        sb.append("\n" + s3);
        sb.append("\n" + s4);
        sb.append("\n" + s5);
        sendEmail(sb);
    }
    private void sendEmail(StringBuffer sbf) {
        //Creating SendMail object
        SendMail sm = new SendMail(this, "k.srimathi7@gmail.com", "Registration for Lecture",sbf);

        //Executing sendmail to send email
        sm.execute();
    }



    }


