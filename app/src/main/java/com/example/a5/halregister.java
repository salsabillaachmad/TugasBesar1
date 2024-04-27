package com.example.a5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class halregister extends AppCompatActivity {

public ImageButton panahlagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halregister);
    }

    public void register(View view) {
        Intent login = new Intent(halregister.this, loginlagi.class);
        startActivity(login);
    }

    public void kembalii(View view) {
        Intent kembali = new Intent(halregister.this, halaman2.class);
        startActivity(kembali);
    }
}