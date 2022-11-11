package com.example.chat_yeremia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView penerima;
    public static String KONTAK = "Reply";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        penerima = (TextView) findViewById(R.id.text_header);
    }

    public void CNTC1(View view){
        Intent page1 = new Intent(MainActivity.this, main_page2.class);
        page1.putExtra(KONTAK,"Udin");
        startActivity(page1);
    }

    public void CNTC2(View view){
        Intent page1 = new Intent(MainActivity.this, main_page2.class);
        page1.putExtra(KONTAK,"David");
        startActivity(page1);
    }

    public void CNTC3(View view){
        Intent page1 = new Intent(MainActivity.this, main_page2.class);
        page1.putExtra(KONTAK,"Yukie");
        startActivity(page1);
    }
}