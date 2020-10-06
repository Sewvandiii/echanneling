package com.example.echanneling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

public class Purchase2 extends AppCompatActivity {

    EditText text1, text2, text3, text4;
    ImageView imgback;

    Button btn;

    AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase2);

        btn = findViewById(R.id.btnpaynow);

        imgback = (ImageView) findViewById(R.id.imageView);

        text1 = findViewById(R.id.cardno);
        text2 = findViewById(R.id.cardholder);
        text3 = findViewById(R.id.expdate);
        text4 = findViewById(R.id.cvv);

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        awesomeValidation.addValidation(this, R.id.cardno, RegexTemplate.NOT_EMPTY, R.string.invalid_cardno);
        awesomeValidation.addValidation(this, R.id.cardholder, RegexTemplate.NOT_EMPTY, R.string.invalid_cardholder);
        awesomeValidation.addValidation(this, R.id.expdate, RegexTemplate.NOT_EMPTY, R.string.invalid_expdate);
        awesomeValidation.addValidation(this, R.id.cvv, RegexTemplate.NOT_EMPTY, R.string.invalid_cvv);


        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Purchase2.this, Payment.class);
                startActivity(intent);

            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (awesomeValidation.validate()) {
                    Toast.makeText(getApplicationContext(), "Details added successfully!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Details added Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

