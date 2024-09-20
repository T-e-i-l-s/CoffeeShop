package com.mustafin.coffee.ui.screens.home;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Objects;

public class CoffeeListDecoration extends RecyclerView.ItemDecoration {
    private final int space;

    public CoffeeListDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(
            Rect outRect,
            @NonNull View view,
            RecyclerView parent,
            @NonNull RecyclerView.State state
    ) {
        outRect.left = space/2;
        outRect.right = space/2;

        int childPosition = parent.getChildLayoutPosition(view);
        int itemCount = Objects.requireNonNull(parent.getAdapter()).getItemCount();

        if (childPosition == 0 || childPosition == 1) {
            outRect.top = space;
        } else {
            outRect.top = 0;
        }

        if (childPosition == itemCount - 1 || childPosition == itemCount - 2) {
            outRect.bottom = getNavigationBarHeight(view);
        } else {
            outRect.bottom = space;
        }
    }

    // Метод для получения высоты навигационной панели
    private int getNavigationBarHeight(View view) {
        @SuppressLint("InternalInsetResource") int resourceId = view.getContext().getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId > 0) {
            return view.getContext().getResources().getDimensionPixelSize(resourceId);
        }
        return 0;
    }
}
