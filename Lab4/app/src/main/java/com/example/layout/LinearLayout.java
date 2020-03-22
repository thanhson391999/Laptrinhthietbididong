package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class LinearLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        Toast toast = Toast.makeText(LinearLayout.this, "Bạn đã khởi động Intent Linear Layout", Toast.LENGTH_LONG);
        toast.show();
    }
}
