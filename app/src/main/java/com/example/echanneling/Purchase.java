package com.example.echanneling;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Purchase extends AppCompatActivity {

    Dialog dialog1;
    ImageView imgback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);

        dialog1 = new Dialog(this);

        imgback = (ImageView) findViewById(R.id.imageView);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Purchase.this,Payment.class);
                startActivity(intent);
            }
        });
    }

    public void ShowPopup(View v) {
        TextView txtclose;


        dialog1.setContentView(R.layout.popup);

        txtclose = (TextView) dialog1.findViewById(R.id.txtclose);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog1.dismiss();
            }
        });

        dialog1.show();
        dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


    }

}