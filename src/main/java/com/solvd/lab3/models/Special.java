package com.solvd.lab3.models;

public class Special extends Meal {
    private final String specialIngredient = "cinnamon";

    static {
        System.out.println("S P E C I A L");
    }

    public Special(String name, double price, MealType mealType) {
        super(name, price, mealType);
    }
}
