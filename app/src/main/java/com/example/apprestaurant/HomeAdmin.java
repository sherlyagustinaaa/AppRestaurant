package com.example.apprestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeAdmin extends AppCompatActivity {

    Button btnKelolaMenu, btnKelolaUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeadmin);

        btnKelolaMenu = findViewById(R.id.btnKelolaMenu);
        btnKelolaUser = findViewById(R.id.btnKelolaUser);

        btnKelolaMenu.setOnClickListener(v -> {
            Intent intent = new Intent(HomeAdmin.this, DaftarMenu.class); // Ganti jika nama kelas berbeda
            startActivity(intent);
        });

        btnKelolaUser.setOnClickListener(v -> {
            Intent intent = new Intent(HomeAdmin.this, DaftarMenu.class); // Ganti jika nama kelas berbeda
            startActivity(intent);
        });
    }
}
