package com.example.a5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Masuk(View view) {
        Intent Masuk = new
                Intent(MainActivity.this, halaman2.class);
        startActivity(Masuk);
    }

    public void regis(View view) {
        Intent regis = new
                Intent(MainActivity.this, halaman2.class);
        startActivity(regis);
    }
}