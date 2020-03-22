package com.example.toast_alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button)this.findViewById(R.id.my_toast);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Toast toast = Toast.makeText(MainActivity.this,"Bạn đã tạo 1 Toast..hihi",Toast.LENGTH_LONG);
                toast.show();
            }
        });
        final Button button1 = (Button)this.findViewById(R.id.my_alertdialog);
        button1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                b.setTitle("Question");
                b.setMessage("Bạn mún thoát hả :(");
                b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                b.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                b.create().show();
            }
        });
        Toast toast = Toast.makeText(MainActivity.this,"Nhấn vào button để xem",Toast.LENGTH_LONG);
        toast.show();
    }
}
