package com.example.myapplicationch9_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class OpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op);
    }
    public void btn2_click(View v){
        int opd1, opd2;
        double result = 0.0;
        RadioButton rdbAdd, rdbSubstract, rdbMultiply, rdbDivision;
        CheckBox chkDivide;

        Bundle bundle = this.getIntent().getExtras();
        if(bundle == null){
            return;
        }
        opd1 = Integer.parseInt(bundle.getString("opd1"));
        opd2 = Integer.parseInt(bundle.getString("opd2"));

        rdbAdd = findViewById(R.id.radd);
        rdbSubstract = findViewById(R.id.rsub);
        rdbMultiply = findViewById(R.id.rmul);
        rdbDivision = findViewById(R.id.rdiv);
        chkDivide = findViewById(R.id.checkBox);

        if(rdbAdd.isChecked()){
            result = opd1 + opd2;
        }
        if(rdbSubstract.isChecked()){
            result = opd1 - opd2;
        }
        if(rdbMultiply.isChecked()){
            result = opd1 * opd2;
        }
        if(rdbDivision.isChecked()){
            if(chkDivide.isChecked()){
                //整除
                result = opd1 / opd2;
            }else{
                result = opd1 / (double) opd2;
            }

        }
        Intent rintent = new Intent();
        Bundle rbundle = new Bundle();
        rbundle.putDouble("RESULT", result);
        rintent.putExtras(rbundle);
        setResult(RESULT_OK, rintent);
        finish();
    }


}