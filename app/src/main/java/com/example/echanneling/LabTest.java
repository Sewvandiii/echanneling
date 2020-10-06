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

public class LabTest extends AppCompatActivity {

    EditText text1, text2, text3, text4, text5;
    ImageView imgback;

    Button btn;

    AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_test);

        btn = findViewById(R.id.submit);

        imgback = (ImageView) findViewById(R.id.imageView);

        text1 = findViewById(R.id.txtname);
        text2 = findViewById(R.id.txtareaa);
        text3 = findViewById(R.id.txtlname);
        text4 = findViewById(R.id.txtmobilee);
        text5 = findViewById(R.id.txtdetails);


        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        awesomeValidation.addValidation(this, R.id.txtname, RegexTemplate.NOT_EMPTY, R.string.invalid_name);
        awesomeValidation.addValidation(this, R.id.txtareaa, RegexTemplate.NOT_EMPTY, R.string.invalid_area);
        awesomeValidation.addValidation(this, R.id.txtlname, RegexTemplate.NOT_EMPTY, R.string.invalid_lname);
        awesomeValidation.addValidation(this, R.id.txtdetails, RegexTemplate.NOT_EMPTY, R.string.invalid_details);
        awesomeValidation.addValidation(this, R.id.txtmobilee, "[5-9]{1}[0-9]{9}$", R.string.invalid_number);

        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LabTest.this, MedLab.class);
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

