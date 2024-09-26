package com.mustafin.coffee.ui.screens.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.mustafin.coffee.R;
import com.mustafin.coffee.domain.models.HomeScreenCoffeeModel;

import java.util.List;

// Adapter для Recycler View со списом кофе
public class CoffeeListAdapter extends RecyclerView.Adapter<CoffeeListAdapter.CoffeeListViewHolder> {
    private final List<HomeScreenCoffeeModel> coffeeList;

    public CoffeeListAdapter(List<HomeScreenCoffeeModel> coffeeList) {
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
        HomeScreenCoffeeModel coffee = coffeeList.get(position);
        holder.nameTextView.setText(coffee.name);
        holder.typeTextView.setText(coffee.type);
        String mappedPrice = "$ " + coffee.price; // TODO: Заменить
        holder.priceTextView.setText(mappedPrice);

        Context context = holder.itemView.getContext();

        if (coffee.isSelected) {
            holder.addButton.setImageResource(R.drawable.minus_icon);
            holder.addButton.setBackground(ContextCompat.getDrawable(context, R.drawable.coffee_list_cell_plus_icon_disabled_shape));
        } else {
            holder.addButton.setImageResource(R.drawable.plus_icon);
            holder.addButton.setBackground(ContextCompat.getDrawable(context, R.drawable.coffee_list_cell_plus_icon_enabled_shape));
        }

        holder.addButton.setOnClickListener(view -> {
            coffee.isSelected = !coffee.isSelected;
            notifyItemChanged(position);
        });
    }

    @Override
    public int getItemCount() {
        return coffeeList.size();
    }

    public static class CoffeeListViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView typeTextView;
        TextView priceTextView;
        ImageButton addButton;

        public CoffeeListViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.coffee_name);
            typeTextView = itemView.findViewById(R.id.coffee_type);
            priceTextView = itemView.findViewById(R.id.coffee_price);
            addButton = itemView.findViewById(R.id.home_coffee_cell_add_button);
        }
    }
}
