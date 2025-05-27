package com.example.apprestaurant;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {MenuItem.class}, exportSchema = false, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MenuItemDAO menuItemDao();
}

