package com.solvd.lab3;

import java.util.Objects;

public class Drink extends MenuItem {
    private String drinkType;

    public Drink(String name, double price, String drinkType) {
        super(name, price);
        this.drinkType = drinkType;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + getName() + '\'' +
                "price='" + getPrice() + '\'' +
                "type='" + drinkType + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), drinkType);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        return (drinkType.equals(((Drink) obj).drinkType));
    }
}
