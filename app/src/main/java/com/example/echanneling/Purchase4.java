package com.example.echanneling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Purchase4 extends AppCompatActivity {

    ImageView imgback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase4);

        imgback = (ImageView) findViewById(R.id.imageView);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Purchase4.this,Payment.class);
                startActivity(intent);
            }
        });
    }
}