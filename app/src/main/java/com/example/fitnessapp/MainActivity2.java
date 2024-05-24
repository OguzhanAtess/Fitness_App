package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txtResult, bmiresult;
        EditText edtWeight, edtheightft, edttheightin,edtage;
        Button btnCalculate;
        LinearLayout llMain;
        edtWeight = findViewById(R.id.edtweight);
        edtheightft = findViewById(R.id.edtheightft);
        edtage = findViewById(R.id.edtage);
        btnCalculate = findViewById(R.id.btnCalculate);

        llMain = findViewById(R.id.llMain);
        bmiresult = findViewById(R.id.bmiresult);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt = Integer.parseInt(edtWeight.getText().toString());
                int ft = Integer.parseInt(edtheightft.getText().toString());
                int age = Integer.parseInt(edtage.getText().toString());

                double cal = (10 * wt + 6.25 * ft - 5 + age -161);
                double cal2 = cal * 1.4;
                bmiresult.setText("Günlük kalori ihtiyacı: " + cal2);



                }

        });
    }
}