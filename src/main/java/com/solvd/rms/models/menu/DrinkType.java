package com.solvd.rms.models.menu;

public enum DrinkType {
    HOT("Hot"),
    COLD("Cold"),
    ;

    private String name;

    DrinkType(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }
}
