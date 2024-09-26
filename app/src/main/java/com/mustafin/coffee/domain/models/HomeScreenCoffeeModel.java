package com.mustafin.coffee.domain.models;

public class HomeScreenCoffeeModel {
    public String name;
    public String type;
    public double price;
    public boolean isSelected;

    public HomeScreenCoffeeModel(String name, String type, double price, boolean isSelected) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.isSelected = isSelected;
    }
}
