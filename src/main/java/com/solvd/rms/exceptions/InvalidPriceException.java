package com.solvd.rms.exceptions;

public class InvalidPriceException extends NumberFormatException{
    public InvalidPriceException(String s) {
        super(s);
    }

    @Override
    public String getMessage() {
        return "Invalid price.";
    }
}
