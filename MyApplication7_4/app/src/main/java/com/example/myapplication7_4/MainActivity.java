package com.example.myapplication7_4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.lbloutput);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int tmp;
        double result;
        EditText txtTemp = findViewById(R.id.txtTemp);
        tmp = Integer.parseInt(txtTemp.getText().toString());
        switch (item.getItemId()){
            case R.id.tof:
                result=(9.0*tmp)/5.0+32.0;
                output.setText("F" + result);
                break;
            case R.id.toc:
                result = (5.0/9.0) * (tmp - 32);
                output.setText("C" + result);

                break;
        }
        return super.onOptionsItemSelected(item);
    }
}