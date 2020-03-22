package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)this.findViewById(R.id.button_relative_layout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RelativeLayout.class);
                MainActivity.this.startActivity(intent);
            }
        });

        Button button1 = (Button)this.findViewById(R.id.button2_linearlayout);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LinearLayout.class);
                MainActivity.this.startActivity(intent);
            }
        });

        Button button2 = (Button)this.findViewById(R.id.button3_tablelayout);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TableLayout.class);
                MainActivity.this.startActivity(intent);
            }
        });

        Button button3 = (Button)this.findViewById(R.id.button4_gridlayout);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GridLayout.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
