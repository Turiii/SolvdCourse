package com.solvd.lab3;

import com.solvd.lab3.models.*;

public class RestaurantManagmentSystem {
    public static void main(String[] args) {
        Drink pepsi = new Drink("Pepsi", 4.2, "soda");
        MenuItem pepsi2 = new Drink("Pepsi", 4.2, "soda");
        Drink juice = new Juice("Orange juice", 3.5, "orange juice");

        Meal meal = new Meal("Meal", 15.00, MealType.HOT);
        MainCourse mainCourse = new MainCourse("Main course", 15.00, MealType.HOT);

        System.out.println(pepsi.equals(pepsi2));
        System.out.println(pepsi.equals(juice));

        System.out.println(meal.equals(mainCourse));
        System.out.println(mainCourse.equals(meal));

        Special special = new Special("Chef special", 14.90, MealType.HOT);

        meal.cook();
        mainCourse.cook();
        meal.consume();
        mainCourse.consume();

        System.out.println(special.getAllItems());
    }
}
