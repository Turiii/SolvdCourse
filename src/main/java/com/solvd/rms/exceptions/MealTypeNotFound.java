package com.solvd.rms.exceptions;

public class MealTypeNotFound extends TypeNotPresentException{
    public MealTypeNotFound(String typeName, Throwable cause) {
        super(typeName, cause);
    }

    @Override
    public String getMessage() {
        return "Meal type not found.";
    }
}
