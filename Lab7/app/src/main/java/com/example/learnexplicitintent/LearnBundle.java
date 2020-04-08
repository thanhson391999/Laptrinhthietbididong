package com.example.learnexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LearnBundle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_bundle);

        final TextView txta = (TextView)findViewById(R.id.txta);
        final TextView txtb = (TextView)findViewById(R.id.txtb);
        Button btnketqua = (Button)findViewById(R.id.btnketqua);
        btnketqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnBundle.this,ResultActivity.class);
                Bundle bundle = new Bundle();
                int a = Integer.parseInt(txta.getText().toString());
                int b = Integer.parseInt(txtb.getText().toString());
                bundle.putInt("soa",a);
                bundle.putInt("sob",b);
                intent.putExtra("MyPackage",bundle);
                startActivity(intent);
            }
        });
    }
}
