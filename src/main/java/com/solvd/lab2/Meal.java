package com.solvd.lab2;

import java.util.Objects;

public class Meal extends MenuItem{
    private String mealType;

    public Meal(String name, double price, String mealType) {
        super(name,price);
        this.mealType = mealType;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + getName() + '\'' +
                "price='" + getPrice() + '\'' +
                "type='" + mealType + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mealType);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        if(!super.equals(obj)) return false;
        return mealType.equals(((Meal) obj).mealType);
    }
}
