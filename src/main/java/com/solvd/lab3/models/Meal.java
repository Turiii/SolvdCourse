package com.solvd.lab3.models;

import com.solvd.lab3.interfaces.Cookable;
import com.solvd.lab3.interfaces.Edible;

import java.util.Objects;

public class Meal extends MenuItem implements Edible, Cookable {
    private MealType mealType;

    public Meal(String name, double price, MealType mealType) {
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

    @Override
    public void cook() {
        System.out.println("cook() from Meal");
    }

    @Override
    public void consume() {
        System.out.println("consume() from Meal");
    }
}
