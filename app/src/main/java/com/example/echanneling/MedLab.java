package com.example.echanneling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MedLab extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_lab);

        imageView = (ImageView) findViewById(R.id.imgprescription);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MedLab.this,MainActivity.class);
                startActivity(intent);
            }
        });

        imageView1 = (ImageView) findViewById(R.id.imglabtest);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MedLab.this,LabTest.class);
                startActivity(intent);
            }
        });

        imageView2 = (ImageView) findViewById(R.id.imgpayment);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MedLab.this,Payment.class);
                startActivity(intent);
            }
        });

        imageView3 = (ImageView) findViewById(R.id.imgdrugs);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MedLab.this,Drugs.class);
                startActivity(intent);
            }
        });

    }
}