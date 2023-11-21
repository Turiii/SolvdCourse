package com.solvd.rms.exceptions;

public class InvalidNameException extends Exception{
    public InvalidNameException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Invalid name.";
    }
}
