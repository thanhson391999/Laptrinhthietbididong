package com.example.learnexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Vidu_Intent_Result extends AppCompatActivity {

    public static final int REQUEST_CODE_INPUT=113;
    public static final int RESULT_CODE_SAVE1=115;
    public static final int RESULT_CODE_SAVE2=116;
    Button btninputdata;
    ListView lvdata;
    ArrayList<Integer> arrdata = new ArrayList<Integer>();
    ArrayAdapter<Integer> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidu__intent__result);

        btninputdata = (Button)findViewById(R.id.btnopenactivity);
        btninputdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vidu_Intent_Result.this,Input_Data_Activity.class);
                startActivityForResult(intent,REQUEST_CODE_INPUT);
            }
        });
        lvdata = (ListView)findViewById(R.id.lvdata);
        adapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_list_item_1,arrdata);
        lvdata.setAdapter(adapter);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==REQUEST_CODE_INPUT)
        {
            switch (resultCode)
            {
                case RESULT_CODE_SAVE1:
                    int v1 =  data.getIntExtra("data",0);
                    arrdata.add(v1*v1);
                    adapter.notifyDataSetChanged();
                    break;
                case RESULT_CODE_SAVE2:
                    int v2 = data.getIntExtra("data",0);
                    arrdata.add(v2);
                    adapter.notifyDataSetChanged();
                    break;
            }
        }
    }
}
