package com.solvd.lab2;

import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
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

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
