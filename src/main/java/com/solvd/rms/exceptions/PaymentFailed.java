package com.solvd.rms.exceptions;

public class PaymentFailed extends Exception{
    public PaymentFailed(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Something went wrong...";
    }
}
