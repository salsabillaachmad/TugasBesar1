package com.example.a5;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class halaman_login extends AppCompatActivity {

    private EditText btnpw;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        btnpw = findViewById(R.id.btnpw);

    }

    public void login(View view) {
        Intent login = new Intent(halaman_login.this, loginlagi.class);
        startActivity(login);
    }

    public void kembali(View view) {
        Intent kembali = new Intent(halaman_login.this, halaman2.class);
        startActivity(kembali);
    }
    public void pencet (View view){
        Intent pencet = new Intent(halaman_login.this, hal5.class);
        startActivity(pencet);
    }
}