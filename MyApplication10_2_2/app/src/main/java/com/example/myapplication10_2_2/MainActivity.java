package com.example.myapplication10_2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    Button元件的事件處理
    public void button_Click(View view){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:24.447749834094036, 118.3229480838379"));
        startActivity(i);
    }
    public void button2_Click(View view){
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:+1234567"));
        startActivity(i);
    }
    public void button3_Click(View view){
        Intent i = new Intent();
        i.setAction(Intent.ACTION_SENDTO);
        i.setData(Uri.parse("mailto:hueyan@ms2.hinet.net"));
        startActivity(i);
    }

}