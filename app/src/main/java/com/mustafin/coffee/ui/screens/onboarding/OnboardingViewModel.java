package com.mustafin.coffee.ui.screens.onboarding;

import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;

import com.mustafin.coffee.R;

public class OnboardingViewModel extends ViewModel {
    private NavController navController = null;

    public void setNavController(NavController navController) {
        this.navController = navController;
    }

    public void onContinue() {
        // TODO: Add Logic
        navController.navigate(R.id.homeScreenFragment);
        System.out.println("show main UI");
    }
}
