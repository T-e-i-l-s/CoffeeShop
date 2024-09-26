package com.mustafin.coffee.ui.screens.home;

import androidx.lifecycle.ViewModel;

import com.mustafin.coffee.domain.models.HomeScreenCoffeeModel;

import java.util.List;

public class HomeScreenViewModel extends ViewModel {
    // TODO: Написать логику
    List<HomeScreenCoffeeModel> coffeeList = List.of(
            new HomeScreenCoffeeModel("Caffe Mocha", "Deep Foam", 4.53, false),
            new HomeScreenCoffeeModel("Flat White", "Espresso", 3.53, false),
            new HomeScreenCoffeeModel("Caffe Mocha", "Deep Foam", 4.53, false),
            new HomeScreenCoffeeModel("Flat White", "Espresso", 3.53, false),
            new HomeScreenCoffeeModel("Caffe Mocha", "Deep Foam", 4.53, false),
            new HomeScreenCoffeeModel("Flat White", "Espresso", 3.53, false),
            new HomeScreenCoffeeModel("Caffe Mocha", "Deep Foam", 4.53, false),
            new HomeScreenCoffeeModel("Flat White", "Espresso", 3.53, false),
            new HomeScreenCoffeeModel("Caffe Mocha", "Deep Foam", 4.53, false),
            new HomeScreenCoffeeModel("Flat White", "Espresso", 3.53, false),
            new HomeScreenCoffeeModel("Caffe Mocha", "Deep Foam", 4.53, false),
            new HomeScreenCoffeeModel("Flat White", "Espresso", 3.53, false)
    );
}
