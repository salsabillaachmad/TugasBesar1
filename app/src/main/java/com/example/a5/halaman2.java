package com.example.a5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class halaman2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
    } public void login(View view) {
        Intent login = new Intent(halaman2.this, loginlagi.class);
        startActivity(login);
    } public void regis(View view) {
        Intent login = new Intent(halaman2.this, halregister.class);
        startActivity(login);
    }
}