package com.example.myapplicationch9_5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static final int SET_RESULT = 1;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.lbloutput);

    }

    public void btn_click(View view){
        EditText txtOpd1, txtOpd2;
        txtOpd1 = findViewById(R.id.txtOpd1);
        txtOpd2 = findViewById(R.id.txtOpd2);
        Intent intent = new Intent(this, OpActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("opd1", txtOpd1.getText().toString());
        bundle.putString("opd2", txtOpd2.getText().toString());
        intent.putExtras(bundle);
        startActivityForResult(intent, SET_RESULT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch( requestCode){
            case SET_RESULT:
                if(resultCode == RESULT_OK){
                    Bundle bundle = data.getExtras();
                    output.setText("Result:" + bundle.getDouble("RESULT"));
                }
                break;
        }
    }
}