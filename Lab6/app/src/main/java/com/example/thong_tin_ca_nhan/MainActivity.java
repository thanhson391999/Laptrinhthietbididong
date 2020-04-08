package com.example.thong_tin_ca_nhan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ethoten,etcmnd,etthongtinbosung;
    CheckBox cbdocbao,cbdocsach,cbdoccoding;
    Button btnguithongtin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         ethoten = (EditText)findViewById(R.id.ethoten);
         etcmnd = (EditText)findViewById(R.id.etcmnd);
         etthongtinbosung = (EditText)findViewById(R.id.etthongtinbosung);
         cbdocbao = (CheckBox)findViewById(R.id.cbdocbao);
         cbdocsach = (CheckBox)findViewById(R.id.cbdocsach);
         cbdoccoding = (CheckBox)findViewById(R.id.cbdoccoding);
         btnguithongtin = (Button)findViewById(R.id.btnguithongtin);
        btnguithongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doShowInformation();
            }
        });
    }
    public void doShowInformation()
    {
        String hoten = ethoten.getText().toString().trim();
        if (hoten.length()<3)
        {
            ethoten.requestFocus();
            ethoten.selectAll();
            Toast.makeText(this, "tên phải >= 3 kí tự", Toast.LENGTH_LONG).show();
            return;
        }
        String cmnd= etcmnd.getText().toString().trim();
        if (cmnd.length()!=9)
        {
            ethoten.requestFocus();
            ethoten.selectAll();
            Toast.makeText(this, "CMND phải đúng 9 số", Toast.LENGTH_LONG).show();
            return;
        }
        String bang = "";
        RadioButton radioButton1 = (RadioButton)findViewById(R.id.rbtrungcap);
        RadioButton radioButton2 = (RadioButton)findViewById(R.id.rbcaodang);
        RadioButton radioButton3 = (RadioButton)findViewById(R.id.rbdaihoc);
        if (radioButton1.isChecked())
        {
            bang = radioButton1.getText().toString();

        }
        if (radioButton2.isChecked())
        {
            bang = radioButton2.getText().toString();

        }
        if (radioButton3.isChecked())
        {
            bang = radioButton3.getText().toString();

        }
        String sothich="";
        if(cbdocbao.isChecked())
            sothich+=cbdocbao.getText().toString()+"\n";
        if(cbdocsach.isChecked())
            sothich+=cbdocsach.getText().toString()+"\n";
        if(cbdoccoding.isChecked())
            sothich+=cbdoccoding.getText().toString()+"\n";
        String bosung=etthongtinbosung.getText().toString();
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Thông tin cá nhân");
        String msg = hoten+"\n";
        msg+= cmnd+"\n";
        msg+=bang+"\n";
        msg+=sothich;
        msg+="—————————–\n";
        msg+="Thông tin bổ sung:\n";
        msg+=bosung+ "\n";
        msg+="—————————–";
        builder.setMessage(msg);//thiếtlậpnộidung
        builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.create().show();//hiểnthịDialog
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}

