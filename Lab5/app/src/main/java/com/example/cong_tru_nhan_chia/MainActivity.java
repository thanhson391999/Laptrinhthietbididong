package com.example.cong_tru_nhan_chia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTexta = (EditText)findViewById(R.id.editsoa);
        final EditText editTextb = (EditText)findViewById(R.id.editsob);
        Button buttoncong = (Button)findViewById(R.id.btncong);
        Button buttontru = (Button)findViewById(R.id.btntru);
        Button buttonnhan = (Button)findViewById(R.id.btnnhan);
        Button buttonchia = (Button)findViewById(R.id.btnchia);
        final TextView textView = (TextView)findViewById(R.id.txtketqua);
        View.OnClickListener myclick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case R.id.btncong:
                        String sa=editTexta.getText().toString();
                        String sb=editTextb.getText().toString();
                        int a=Integer.parseInt(sa);
                        int b=Integer.parseInt(sb);
                        textView.setText(a+"+"+b+"="+(a+b));
                        break;
                    case R.id.btntru:
                         sa=editTexta.getText().toString();
                         sb=editTextb.getText().toString();
                         a=Integer.parseInt(sa);
                         b=Integer.parseInt(sb);
                         textView.setText(a+"-"+b+"="+(a-b));
                         break;
                    case R.id.btnnhan:
                        sa=editTexta.getText().toString();
                        sb=editTextb.getText().toString();
                        a=Integer.parseInt(sa);
                        b=Integer.parseInt(sb);
                        textView.setText(a+"*"+b+"="+(a*b));
                        break;
                    case R.id.btnchia:
                        sa=editTexta.getText().toString();
                        sb=editTextb.getText().toString();
                        a=Integer.parseInt(sa);
                        b=Integer.parseInt(sb);
                        textView.setText(a+"/"+b+"="+(a/b));
                        break;
                }
            }
        };
        buttoncong.setOnClickListener(myclick);
        buttontru.setOnClickListener(myclick);
        buttonnhan.setOnClickListener(myclick);
        buttonchia.setOnClickListener(myclick);
    }
}
