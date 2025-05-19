package com.example.apprestaurant;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    RecyclerView rvMenu;
    Button btnCheckout;
    List<MenuItem> menuList = new ArrayList<>();
    List<MenuItem> cart = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        rvMenu = findViewById(R.id.rv_menu);
        btnCheckout = findViewById(R.id.btn_checkout);

        // Contoh menu
        menuList.add(new MenuItem("Mie Pedas Lv.1", 10000));
        menuList.add(new MenuItem("Mie Pedas Lv.2", 12000));
        menuList.add(new MenuItem("Es Teh", 5000));

        MenuAdapter adapter = new MenuAdapter(menuList);
        rvMenu.setLayoutManager(new LinearLayoutManager(this));
        rvMenu.setAdapter(adapter);

        btnCheckout.setOnClickListener(v -> {
            int total = 0;
            for (MenuItem item : cart) {
                total += item.getPrice();
            }
            Toast.makeText(this, "Total: Rp " + total, Toast.LENGTH_LONG).show();
        });
    }
}
