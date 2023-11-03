package com.solvd.lab3.models;

import com.solvd.lab3.interfaces.Nameable;
import com.solvd.lab3.interfaces.Priceable;

import java.util.Objects;

public abstract class MenuItem implements Priceable, Nameable {

    private static Integer allItems = 0;

    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
        allItems++;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,price);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        return Double.compare(price, ((MenuItem) obj).price) == 0 && name.equals(((MenuItem) obj).name);
    }

    public final String getName() {
        return name;
    }

    public final double getPrice() {
        return price;
    }

    public final Integer getAllItems(){
        return allItems;
    }
}
