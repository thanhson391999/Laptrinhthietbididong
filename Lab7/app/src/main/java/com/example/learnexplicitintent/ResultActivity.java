package com.example.learnexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView txtketqua = (TextView) findViewById(R.id.txtketqua);
        Button btnback = (Button) findViewById(R.id.btnback);
        Intent callerIntent = getIntent();
        Bundle backageFromCaller = callerIntent.getBundleExtra("MyPackage");
        int a = backageFromCaller.getInt("soa");
        int b = backageFromCaller.getInt("sob");
        String kq;
        if (a == 0 && b == 0) {
            kq = "Vô số nghiệm";
        } else if (a == 0 && b != 0) {
            kq = "Vô nghiệm";
        } else {
            DecimalFormat dcf = new DecimalFormat("0.##");
            kq = dcf.format(-b * 1.0 / a);
        }
        txtketqua.setText(kq);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

