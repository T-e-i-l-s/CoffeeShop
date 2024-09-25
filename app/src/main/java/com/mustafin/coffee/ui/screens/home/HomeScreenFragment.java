package com.mustafin.coffee.ui.screens.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mustafin.coffee.R;
import com.mustafin.coffee.domain.models.ShortCoffeeModel;

import java.util.List;

// Фрагмент главного экрана
public class HomeScreenFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.home_screen, container, false);

        HomeScreenViewModel viewModel = new ViewModelProvider(this).get(HomeScreenViewModel.class);

        LinearLayout homeContainer = root.findViewById(R.id.home_container);
        ViewCompat.setOnApplyWindowInsetsListener(homeContainer, (view, insets) -> {
            int statusBarInset = insets.getInsets(WindowInsetsCompat.Type.statusBars()).top;
            view.setPadding(
                    view.getPaddingLeft(),
                    statusBarInset,
                    view.getPaddingRight(),
                    view.getPaddingBottom()
            );
            return insets;
        });

        View promoBanner = root.findViewById(R.id.home_promo_banner);
        promoBanner.getViewTreeObserver().addOnGlobalLayoutListener(() -> {
            // Высчитываем высоту черного header
            // Получаем положение рекланого банера
            int[] location = new int[2];
            promoBanner.getLocationOnScreen(location);
            // Получаем высоту рекланого банера
            int promoBannerHeight = promoBanner.getHeight();

            // Задаем высоту черному header
            RelativeLayout header = root.findViewById(R.id.home_header);
            header.getLayoutParams().height = location[1] + promoBannerHeight / 2;
            header.requestLayout();
        });

        // Настраиваем список кофе
        RecyclerView coffeeListView = root.findViewById(R.id.coffee_recycler_view);
        coffeeListView.setAdapter(new CoffeeListAdapter(viewModel.coffeeList));
        coffeeListView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        int spaceWidthInPx = (int) (16 * this.getResources().getDisplayMetrics().density);
        coffeeListView.addItemDecoration(new CoffeeListDecoration(spaceWidthInPx));

        return root;
    }
}
