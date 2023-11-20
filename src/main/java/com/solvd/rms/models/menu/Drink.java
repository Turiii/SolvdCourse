package com.solvd.rms.models.menu;

import com.solvd.rms.interfaces.menu.Drinkable;

public class Drink extends MenuItem implements Drinkable {
    @Override
    public void sip() {
        System.out.println("Sipping...");
    }

    private DrinkType type;

    public Drink(String name, Double price, String description, DrinkType type) {
        super(name, price, description);
        this.type = type;
    }

    public DrinkType getType() {
        return type;
    }

}
