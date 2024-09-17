package com.mustafin.coffee.ui.screens.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.mustafin.coffee.R;
import com.mustafin.coffee.domain.models.ShortCoffeeModel;

import java.util.List;

public class HomeScreenFragment extends Fragment {
    List<ShortCoffeeModel> coffeeList = List.of(
            new ShortCoffeeModel("Caffe Mocha", "Deep Foam", 4.53),
            new ShortCoffeeModel("Flat White", "Espresso", 3.53),
            new ShortCoffeeModel("Caffe Mocha", "Deep Foam", 4.53),
            new ShortCoffeeModel("Flat White", "Espresso", 3.53)
            );

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.home_screen, container, false);

        return root;
    }
}
