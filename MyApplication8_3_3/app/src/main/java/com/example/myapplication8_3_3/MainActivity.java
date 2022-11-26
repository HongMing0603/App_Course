package com.example.myapplication8_3_3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int position) {
        Button button = findViewById(R.id.button);
        switch (position) {
            case 0:
                button.setBackgroundColor(Color.RED);
                break;
            case 1:
                button.setBackgroundColor(Color.YELLOW);
                break;
            case 2:
                button.setBackgroundColor(Color.GREEN);
                break;

        }

    }
    public void btn_Click(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Select one color");
        String [] options = {"RED","YELLOW","GREEN"};
        builder.setItems(options, this);
        builder.setNegativeButton("Cancel", this);
        builder.show();
    }
}