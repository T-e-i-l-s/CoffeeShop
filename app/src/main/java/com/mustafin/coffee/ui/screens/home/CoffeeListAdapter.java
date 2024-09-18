package com.mustafin.coffee.ui.screens.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mustafin.coffee.R;
import com.mustafin.coffee.domain.models.ShortCoffeeModel;

import java.util.List;

// Adapter для Recycler View со списом кофе
public class CoffeeListAdapter extends RecyclerView.Adapter<CoffeeListAdapter.CoffeeListViewHolder> {
    private final List<ShortCoffeeModel> coffeeList;

    public CoffeeListAdapter(List<ShortCoffeeModel> coffeeList) {
        this.coffeeList = coffeeList;
    }

    @NonNull
    @Override
    public CoffeeListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_coffee_list_cell, parent, false);
        return new CoffeeListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoffeeListViewHolder holder, int position) {
        ShortCoffeeModel coffee = coffeeList.get(position);
        holder.nameTextView.setText(coffee.name);
        holder.typeTextView.setText(coffee.type);
        String mappedPrice = "$ " + coffee.price; // TODO: Заменить
        holder.priceTextView.setText(mappedPrice);
    }

    @Override
    public int getItemCount() {
        return coffeeList.size();
    }

    public static class CoffeeListViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView typeTextView;
        TextView priceTextView;

        public CoffeeListViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.coffee_name);
            typeTextView = itemView.findViewById(R.id.coffee_type);
            priceTextView = itemView.findViewById(R.id.coffee_price);
        }
    }
}
