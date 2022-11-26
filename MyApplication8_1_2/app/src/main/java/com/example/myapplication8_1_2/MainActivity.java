package com.example.myapplication8_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener{
    EditText opd1, opd2;
    TextView output;
    Spinner sp1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opd1 = findViewById(R.id.opd1);
        opd2 = findViewById(R.id.opd2);
        sp1 = findViewById(R.id.spinner);
        sp1.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        int v1, v2;
        double r =0.0;
        try {
            v1 = Integer.parseInt(opd1.getText().toString());
            v2 = Integer.parseInt(opd2.getText().toString());
            switch(i){
                case 0:
                    r = v1 + v2;
                    break;
                case 1:
                    r = v1 - v2;
                    break;
                case 2:
                    r = v1 * v2;
                    break;
                case 3:
                    r = v1 / v2;
                    break;
            }
                output.setText("Result:" + r);
        }catch (Exception e){
            output.setText(e.getMessage());
            Log.d("Ch08_1_2", "除以零的錯誤");
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}