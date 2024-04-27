package com.example.a5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class loginlagi extends AppCompatActivity {

private ImageButton panah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginlagi);
    }

    public void loginnn(View view) {
        Intent login = new Intent(loginlagi.this, hal5.class);
        startActivity(login);
    }

    public void kembali(View view) {
        Intent kembali = new Intent(loginlagi.this, halaman2.class);
        startActivity(kembali);
    }
}