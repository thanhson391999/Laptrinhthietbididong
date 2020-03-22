package com.example.androidbasic2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)this.findViewById(R.id.go_button1);
        button1.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                Intent myIntent = new Intent(MainActivity.this, Example1Activity.class);
                myIntent.putExtra("text1", "This is text");
                myIntent.putExtra("text2", "This is long text");
                MainActivity.this.startActivity(myIntent);
            }
        });

        Button button2 = (Button)this.findViewById(R.id.go_button2);
        button2.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                Intent myIntent = new Intent(MainActivity.this, Example2Activity.class);
                myIntent.putExtra("text1", "This is text");
                myIntent.putExtra("text2", "This is long text");
                MainActivity.this.startActivity(myIntent);
            }
        });

        Button button3 = (Button)this.findViewById(R.id.go_button3);
        button3.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                Intent myIntent = new Intent(MainActivity.this, Example3Activity.class);
                myIntent.putExtra("text1", "This is text");
                myIntent.putExtra("text2", "This is long text");
                MainActivity.this.startActivity(myIntent);
            }
        });

        Button button4 = (Button)this.findViewById(R.id.go_button4);
        button4.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                Intent myIntent = new Intent(MainActivity.this, Example4Activity.class);
                myIntent.putExtra("text1", "This is text");
                myIntent.putExtra("text2", "This is long text");
                MainActivity.this.startActivity(myIntent);
            }
        });

        Button button5 = (Button)this.findViewById(R.id.go_button5);
        button5.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                Intent myIntent = new Intent(MainActivity.this, Example5Activity.class);
                myIntent.putExtra("text1", "This is text");
                myIntent.putExtra("text2", "This is long text");
                MainActivity.this.startActivity(myIntent);
            }
        });
    }

}
