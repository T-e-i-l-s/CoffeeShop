package com.mustafin.coffee.ui.screens.home;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
        outRect.bottom = space;

        if (parent.getChildLayoutPosition(view) == 0 || parent.getChildLayoutPosition(view) == 1) {
            outRect.top = space;
        } else {
            outRect.top = 0;
        }
    }
}
