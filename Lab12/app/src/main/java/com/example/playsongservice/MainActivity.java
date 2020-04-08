package com.example.playsongservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void PlaySong(View v) {
        Intent intent = new Intent(MainActivity.this, PlaySongService.class);
        this.startService(intent);
    }
    public void StopSong(View v){
        Intent intent = new Intent(MainActivity.this,PlaySongService.class);
        this.stopService(intent);
    }

}
