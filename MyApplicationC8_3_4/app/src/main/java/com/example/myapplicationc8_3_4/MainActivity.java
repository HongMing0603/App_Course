package com.example.myapplicationc8_3_4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements DialogInterface.OnClickListener, DialogInterface.OnMultiChoiceClickListener {
    String [] items = {"Samsung", "OPPO", "Apple", "ASUS"};
    boolean [] itemsChecked = new boolean[4];
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.output);
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        String msg = "";
        for (int index = 0;index < items.length; index++){
            if(itemsChecked[index]){
                msg += items[index] +"\n";
            }
        }
        output.setText(msg);
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
        Toast.makeText(MainActivity.this, items[i]+(b ? "checked" : "not Checked"),
                Toast.LENGTH_SHORT).show();

    }
    public void btn_Click(View view){
        AlertDialog build = new AlertDialog.Builder(this)
                .setTitle("Please check the items")
                .setPositiveButton("OK", this)
                .setNegativeButton("Cancel", null)
                .setMultiChoiceItems(items, itemsChecked, this)
                .show();
        }

}