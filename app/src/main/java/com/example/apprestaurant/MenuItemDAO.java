package com.example.apprestaurant;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MenuItemDAO {
    @Query("SELECT * FROM MenuItem")
    List<MenuItem> getAll();

    @Insert
    void insert(MenuItem item);

    @Insert
    void insertAll(MenuItem... items);
}
