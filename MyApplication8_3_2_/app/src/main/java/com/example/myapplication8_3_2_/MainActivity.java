package com.example.myapplication8_3_2_;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i){
            case DialogInterface.BUTTON_POSITIVE:
                finish();
                break;
            case DialogInterface.BUTTON_NEGATIVE:
                Toast.makeText(this,"The cancel button is pressed", Toast.LENGTH_SHORT).show();

                break;
        }
    }
public void button_Click(View view)  {
    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    builder.setTitle("OK")
            .setMessage("Exit?")
            .setPositiveButton("OK", this)
            .setNegativeButton("Cancel", this)
            .show();

}
}