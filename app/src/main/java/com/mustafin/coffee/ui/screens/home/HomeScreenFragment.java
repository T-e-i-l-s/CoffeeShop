package com.mustafin.coffee.ui.screens.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mustafin.coffee.R;
import com.mustafin.coffee.domain.models.ShortCoffeeModel;

import java.util.List;

// Фрагмент главного экрана
public class HomeScreenFragment extends Fragment {
    // TODO: Заменить заглушку
    List<ShortCoffeeModel> coffeeList = List.of(
            new ShortCoffeeModel("Caffe Mocha", "Deep Foam", 4.53),
            new ShortCoffeeModel("Flat White", "Espresso", 3.53),
            new ShortCoffeeModel("Caffe Mocha", "Deep Foam", 4.53),
            new ShortCoffeeModel("Flat White", "Espresso", 3.53),
            new ShortCoffeeModel("Caffe Mocha", "Deep Foam", 4.53),
            new ShortCoffeeModel("Flat White", "Espresso", 3.53),
            new ShortCoffeeModel("Caffe Mocha", "Deep Foam", 4.53),
            new ShortCoffeeModel("Flat White", "Espresso", 3.53),
            new ShortCoffeeModel("Caffe Mocha", "Deep Foam", 4.53),
            new ShortCoffeeModel("Flat White", "Espresso", 3.53),
            new ShortCoffeeModel("Caffe Mocha", "Deep Foam", 4.53),
            new ShortCoffeeModel("Flat White", "Espresso", 3.53)
    );

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.home_screen, container, false);

        LinearLayout header = root.findViewById(R.id.home_header);
        ViewCompat.setOnApplyWindowInsetsListener(header, (view, insets) -> {
            int statusBarInset = insets.getInsets(WindowInsetsCompat.Type.statusBars()).top;
            view.setPadding(
                    view.getPaddingLeft(),
                    statusBarInset,
                    view.getPaddingRight(),
                    view.getPaddingBottom()
            );
            return insets;
        });

        RecyclerView coffeeListView = root.findViewById(R.id.coffee_recycler_view);
        coffeeListView.setAdapter(new CoffeeListAdapter(coffeeList));
        coffeeListView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        int spaceWidthInPx = (int) (16 * this.getResources().getDisplayMetrics().density);
        coffeeListView.addItemDecoration(new CoffeeListDecoration(spaceWidthInPx));

        return root;
    }
}
