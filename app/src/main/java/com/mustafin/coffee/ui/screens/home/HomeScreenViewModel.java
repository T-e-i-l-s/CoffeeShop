package com.mustafin.coffee.ui.screens.home;

import androidx.lifecycle.ViewModel;

import com.mustafin.coffee.domain.models.ShortCoffeeModel;

import java.util.List;

public class HomeScreenViewModel extends ViewModel {
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
}
