package com.example.learnexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Input_Data_Activity extends AppCompatActivity {

    Button btnsave1,btnsave2;
    EditText editnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input__data_);

        btnsave1 = (Button)findViewById(R.id.btnluubinhphuong);
        btnsave2 = (Button)findViewById(R.id.btnluusogoc);
        btnsave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToMain(Vidu_Intent_Result.RESULT_CODE_SAVE1);
            }
        });
        editnumber = (EditText)findViewById(R.id.txtnhapso);
        btnsave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToMain(Vidu_Intent_Result.RESULT_CODE_SAVE2);
            }
        });
    }
    public void sendToMain(int resultcode)
    {
        Intent intent = getIntent();
        int value = Integer.parseInt(editnumber.getText().toString());
        intent.putExtra("data",value);
        setResult(resultcode,intent);
        finish();
    }
}
