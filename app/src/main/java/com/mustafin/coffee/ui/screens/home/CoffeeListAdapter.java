package com.mustafin.coffee.ui.screens.home;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mustafin.coffee.R;
import com.mustafin.coffee.domain.models.ShortCoffeeModel;

import java.util.List;

public class CoffeeListAdapter extends RecyclerView.Adapter<CoffeeListAdapter.CoffeeListViewHolder> {
    private List<ShortCoffeeModel> coffeeList;

    public CoffeeListAdapter(List<ShortCoffeeModel> coffeeList) {
        this.coffeeList = coffeeList;
    }

    @NonNull
    @Override
    public CoffeeListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CoffeeListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class CoffeeListViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public CoffeeListViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.home_location_name_text);
        }
    }
}
