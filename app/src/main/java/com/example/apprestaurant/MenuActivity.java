package com.example.apprestaurant;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    RecyclerView rvMenu;
    Button btnCheckout;
    List<MenuItem> cart = new ArrayList<>();
    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        rvMenu = findViewById(R.id.rv_menu);
        btnCheckout = findViewById(R.id.btn_checkout);

        // Inisialisasi database
        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "menu-db").allowMainThreadQueries().build();

        // Jika database kosong, masukkan data awal
        if (db.menuItemDao().getAll().isEmpty()) {
            db.menuItemDao().insertAll(
                    new MenuItem("Mie Pedas Lv.1", 10000),
                    new MenuItem("Mie Pedas Lv.2", 12000),
                    new MenuItem("Es Teh", 5000)
            );
        }

        // Ambil data dari database
        List<MenuItem> menuList = db.menuItemDao().getAll();

        MenuAdapter adapter = new MenuAdapter(menuList);
        rvMenu.setLayoutManager(new LinearLayoutManager(this));
        rvMenu.setAdapter(adapter);

        btnCheckout.setOnClickListener(v -> {
            int total = 0;
            for (MenuItem item : cart) {
                total += item.getPrice();
            }
            Toast.makeText(this, String.format("Total: Rp %,d", total), Toast.LENGTH_LONG).show();
        });
    }
}
