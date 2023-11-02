package com.solvd.lab2;

public class Special extends Meal{
    private String specialIngredient;

    public Special(String name, double price, String mealType, String specialIngredient) {
        super(name, price, mealType);
        this.specialIngredient = specialIngredient;
    }
}
