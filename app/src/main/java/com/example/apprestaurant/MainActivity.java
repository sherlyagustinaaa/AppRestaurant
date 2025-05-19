package com.example.apprestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        Button btnScanQR;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            btnScanQR = findViewById(R.id.btn_scan_qr);

            btnScanQR.setOnClickListener(v -> {
                // Simulasi scan QR → lanjut ke halaman menu
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            });
        }
    }


