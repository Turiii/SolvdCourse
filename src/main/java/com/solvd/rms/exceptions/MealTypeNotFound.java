package com.solvd.rms.exceptions;

public class MealTypeNotFound extends Exception{
    public MealTypeNotFound(String typeName) {
        super(typeName);
    }

    @Override
    public String getMessage() {
        return "Meal type not found.";
    }
}
