package com.example.chat_yeremia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView penerima;
    public static String Kontak = "Reply";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        penerima = (TextView) findViewById(R.id.text_header);
    }

    public void MYSON(View view){
        Intent page1 = new Intent(MainActivity.this, hal2_utama.class);
        page1.putExtra(Kontak,"MY SON");
    }
}