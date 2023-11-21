package com.solvd.rms.models.menu;

import com.solvd.rms.exceptions.InvalidNameException;
import com.solvd.rms.exceptions.InvalidPriceException;
import com.solvd.rms.interfaces.menu.Cookable;
import com.solvd.rms.interfaces.menu.Edible;
import com.solvd.rms.models.order.Order;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Meal extends MenuItem implements Edible, Cookable {
    private static final Logger logger = LogManager.getLogManager().getLogger("MealLogger");
    private MealType type;

    public Meal(String name, Double price, String description, MealType type) {
        super(name, price, description);
        try {
            validateName(name);
            validatePrice(price);
        } catch (InvalidNameException | InvalidPriceException exception) {
            logger.error("Error creating Meal: " + exception.getMessage());
            exception.printStackTrace();
        }
        this.type = type;
    }

    public MealType getType() {
        return type;
    }

    @Override
    public void cook() {
        System.out.println("Cooking meal...");
    }

    @Override
    public void consume() {
        System.out.println("Consuming meal...");
    }

    private void validatePrice(Double price) throws InvalidPriceException {
        if (price <= 0) {
            throw new InvalidPriceException("Price cannot be 0 or negative.");
        }
    }

    private void validateName(String name) throws InvalidNameException {
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new InvalidNameException("Name cannot be null or empty");
        }
    }
}
