package com.example.playsongservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class PlaySongService extends Service {
    private MediaPlayer mediaPlayer;
    public PlaySongService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
        // TODO: Return the communication channel to the service.
    }
    @Override
    public void onCreate(){
        super.onCreate();
        // Tạo đối tượng MediaPlayer, chơi file nhạc của .
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.mysong);
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        // Chơi nhạc
        mediaPlayer.start();
        return START_STICKY;
    }// Hủy bỏdịch vụ.
     @Override
     public void onDestroy() {
        // Giải phóng nguồn dữnguồn phát nhạc.
         mediaPlayer.release();
         super.onDestroy();
    }

}


