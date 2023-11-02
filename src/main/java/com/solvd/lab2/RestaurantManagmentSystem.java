package com.solvd.lab2;

public class RestaurantManagmentSystem {
    public static void main(String[] args) {
        Drink pepsi = new Drink("Pepsi", 4.2, "soda");
        MenuItem pepsi2 = new Drink("Pepsi", 4.2, "soda");
        Drink juice = new Juice("Orange juice", 3.5, "orange juice");

        Meal meal = new MainCourse("Main course", 15.00, "main");
        MainCourse mainCourse = new MainCourse("Main course", 15.00, "main");

        System.out.println(pepsi.equals(pepsi2));
        System.out.println(pepsi.equals(juice));

        System.out.println(meal.equals(mainCourse));
        System.out.println(mainCourse.equals(meal));

        System.out.println(meal.toString());
        System.out.println(pepsi.toString());
    }
}
