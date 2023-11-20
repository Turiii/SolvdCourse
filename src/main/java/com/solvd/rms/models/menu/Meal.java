package com.solvd.rms.models.menu;

import com.solvd.rms.interfaces.menu.Cookable;
import com.solvd.rms.interfaces.menu.Edible;

public class Meal extends MenuItem implements Edible, Cookable {
    @Override
    public void cook() {
        System.out.println("Cooking meal...");
    }

    @Override
    public void consume() {
        System.out.println("Consuming meal...");
    }

    private MealType type;

    public Meal(String name, Double price, String description, MealType type) {
        super(name, price, description);
        this.type = type;
    }

    public MealType getType() {
        return type;
    }
}
