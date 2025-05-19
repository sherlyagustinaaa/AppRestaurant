package com.example.apprestaurant;

public class MenuItem {

    private String namaMenu;
    private String hargaMenu;

    public MenuItem(String namaMenu, int hargaMenu) {
        this.namaMenu = namaMenu;
        this.hargaMenu = String.valueOf(hargaMenu);
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public String getHargaMenu() {
        return hargaMenu;
    }

    public int getPrice() {
        return Integer.parseInt(hargaMenu);
    }
}
