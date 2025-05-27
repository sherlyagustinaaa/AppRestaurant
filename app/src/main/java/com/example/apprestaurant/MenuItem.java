package com.example.apprestaurant;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class MenuItem {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String name;
    public int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
}
