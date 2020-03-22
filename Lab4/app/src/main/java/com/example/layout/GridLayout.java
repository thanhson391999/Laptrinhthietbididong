package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class GridLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        Toast toast = Toast.makeText(GridLayout.this, "Bạn đã khởi động Intent Grid Layout", Toast.LENGTH_LONG);
        toast.show();
    }
}
