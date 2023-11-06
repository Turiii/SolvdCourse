package com.solvd.rms.models.menu;

public enum MealType {
    BREAKFAST("Breakfast"),
    LUNCH("Lunch"),
    DINNER("Dinner"),
    DESSERT("Dessert"),
    ;

    private String name;

    MealType(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }
}
