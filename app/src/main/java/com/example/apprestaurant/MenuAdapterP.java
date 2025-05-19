package com.example.apprestaurant;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MenuAdapterP extends RecyclerView.Adapter<MenuAdapterP.ViewHolder> {

    List<MenuItem> menuList;
    List<MenuItem> cart;

    public MenuAdapterP(List<MenuItem> menuList, List<MenuItem> cart) {
        this.menuList = menuList;
        this.cart = cart;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_menu, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MenuItem item = menuList.get(position);
        holder.name.setText(item.getNamaMenu());
        holder.price.setText("Rp " + item.getHargaMenu());

        holder.btnAdd.setOnClickListener(v -> {
            cart.add(item);
            Toast.makeText(v.getContext(), "Ditambahkan ke keranjang", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, price;
        Button btnAdd;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txt_item_name);
            price = itemView.findViewById(R.id.txt_item_price);
            btnAdd = itemView.findViewById(R.id.btn_add);
        }
    }
}
