package com.mustafin.coffee.ui.screens.onboarding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.mustafin.coffee.R;

// Фрагмент экрана загрузки
public class OnboardingScreenFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        // View Model для этого фрагмента
        OnboardingViewModel viewModel = new ViewModelProvider(this).get(OnboardingViewModel.class);

        // Настраиваем UI
        View root = inflater.inflate(R.layout.onboarding_screen, container, false);

        Button acceptButton = root.findViewById(R.id.onboarding_button);
        acceptButton.setOnClickListener(v -> {
            viewModel.onContinue();
        });

        return root;
    }
}
