package com.example.apprestaurant;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    private List<MenuItem> menuItemList;

    public MenuAdapter(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        MenuItem menuItem = menuItemList.get(position);
        holder.tvNamaMenu.setText(menuItem.getName());
        holder.tvHargaMenu.setText(String.format("Rp %,d", menuItem.getPrice()));
    }

    @Override
    public int getItemCount() {
        return menuItemList.size();
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder {

        TextView tvNamaMenu, tvHargaMenu;

        public MenuViewHolder(View itemView) {
            super(itemView);
            tvNamaMenu = itemView.findViewById(R.id.tvNamaMenu);
            tvHargaMenu = itemView.findViewById(R.id.tvHargaMenu);
        }
    }
}
