package com.example.apprestaurant;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class DaftarMenu extends AppCompatActivity {

    RecyclerView recyclerViewMenu;
    FloatingActionButton fabAddMenu;
    MenuAdapter menuAdapter;
    List<MenuItem> menuItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarmenu);

        recyclerViewMenu = findViewById(R.id.recyclerViewMenu);
        fabAddMenu = findViewById(R.id.fabAddMenu);

        // Data menu
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Nasi Goreng", 15000));
        menuItems.add(new MenuItem("Mie Goreng", 12000));
        menuItems.add(new MenuItem("Ayam Bakar", 20000));
        menuItems.add(new MenuItem("Sate", 18000));

        // Setup RecyclerView
        recyclerViewMenu.setLayoutManager(new LinearLayoutManager(this));
        menuAdapter = new MenuAdapter(menuItems); // hanya 1 parameter
        recyclerViewMenu.setAdapter(menuAdapter);

        fabAddMenu.setOnClickListener(view -> {
            // Diisi kalau punya activity untuk tambah menu
        });
    }
}
