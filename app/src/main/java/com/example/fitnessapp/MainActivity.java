package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fitnessapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtResult = null, bmiresult;
        EditText edtWeight, edtheightft, edttheightin,edtage;
        Button btnWomen;
        Button btnCalculate;
        LinearLayout llMain;
        btnWomen = findViewById(R.id.btnWomen);
        edtWeight = findViewById(R.id.edtweight);
        edtheightft = findViewById(R.id.edtheightft);
        edtage = findViewById(R.id.edtage);
        btnCalculate = findViewById(R.id.btnCalculate);
        llMain = findViewById(R.id.llMain);
        bmiresult = findViewById(R.id.bmiresult);
        btnWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt = Integer.parseInt(edtWeight.getText().toString());
                int ft = Integer.parseInt(edtheightft.getText().toString());
                int age = Integer.parseInt(edtage.getText().toString());

                double cal = (10 * wt + 6.25 * ft - 5 + age + 5);
                double cal2 = cal * 1.4;
                bmiresult.setText("Günlük kalori ihtiyacı: " + cal2);




                }

        });
    }
}