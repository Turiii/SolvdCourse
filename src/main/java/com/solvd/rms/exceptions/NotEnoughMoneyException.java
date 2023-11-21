package com.solvd.rms.exceptions;

public class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Not enough money to pay bill.";
    }
}
