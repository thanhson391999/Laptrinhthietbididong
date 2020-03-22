package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public final String TAG = "MyMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout layout = new RelativeLayout(this);
        layout.setBackgroundColor(Color.GREEN);

        Button button = new Button(this);
        button.setText("My Button");
        layout.addView(button);
        setContentView(layout);
        Log.i(TAG,"onCreate");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.i(TAG,"onStop");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.i(TAG, "onPause");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i(TAG,"onResume");
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.i(TAG,"onStart");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_xml, menu);

        // Print Log
        Log.i(TAG, "onCreateOptionsMenu");
        return true;
    }



}
