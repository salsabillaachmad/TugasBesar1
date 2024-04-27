package com.example.a5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class hal5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal5);
        DrawerLayout drawerLayout = findViewById(R.id.driver_layout);
        ;
        NavigationView navigationView= findViewById(R.id.nav_menu);


        navigationView.setNavigationItemSelectedListener(item -> {
            if (item.getItemId() == R.id.logout) {
                // Buka halaman pertama jika item menu 1 diklik
                Intent intent1= new Intent(hal5.this, loginlagi.class);
                startActivity(intent1);
            }

            drawerLayout.closeDrawers();
            return true;
        });

    }

    public void openDrawer(View view) {
        DrawerLayout drawerLayout = findViewById(R.id.driver_layout);
        if (drawerLayout.isDrawerOpen(GravityCompat.END)) {
            drawerLayout.closeDrawer(GravityCompat.END);
        } else {
            drawerLayout.openDrawer(GravityCompat.END);
        }

    }
}
