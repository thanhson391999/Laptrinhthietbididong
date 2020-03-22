package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class TableLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
        Toast toast = Toast.makeText(TableLayout.this, "Bạn đã khởi động Intent Table Layout", Toast.LENGTH_LONG);
        toast.show();
    }
}
