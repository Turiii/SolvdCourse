package com.solvd.oop;

public class RestaurantManagmentSystem {
    public static void main(String[] args) {
        Drink pepsi = new Drink("Pepsi", 4.2, "soda");
        Drink pepsi2 = new Drink("Pepsi", 4.2, "soda");
        Drink cola = new Drink("Coca-Cola", 4.2, "soda");
        System.out.println(pepsi.equals(pepsi2));
        System.out.println(pepsi.equals(cola));

    }
}
