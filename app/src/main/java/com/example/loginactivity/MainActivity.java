/*
    Created by Ian Martin and
 */

package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnGoog;
    Button btnFace;
    Button btnTweet;
    Button btnMail;
    Button btnAcc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGoog = findViewById(R.id.btngoog);
        btnFace = findViewById(R.id.btnface);
        btnTweet = findViewById(R.id.btntweet);
        btnMail = findViewById(R.id.btnmail);
        btnAcc = findViewById(R.id.btnacc);

        btnGoog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Signing into Google", Toast.LENGTH_SHORT).show();
            }
        });

        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Signing into Facebook", Toast.LENGTH_SHORT).show();
            }
        });

        btnTweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Signing into Twitter", Toast.LENGTH_SHORT).show();
            }
        });

        btnMail.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),"Signing into Email",Toast.LENGTH_SHORT).show();
            }
        });

        btnAcc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),"Creating Account",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
