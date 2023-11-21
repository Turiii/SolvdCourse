package com.solvd.rms.models.menu;

import com.solvd.rms.exceptions.InvalidNameException;
import com.solvd.rms.exceptions.InvalidPriceException;
import com.solvd.rms.exceptions.MealTypeNotFound;
import com.solvd.rms.interfaces.menu.Cookable;
import com.solvd.rms.interfaces.menu.Edible;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;


public class Meal extends MenuItem implements Edible, Cookable {
    private static final Logger logger = LogManager.getLogger(Meal.class);
    private MealType type;

    public Meal(String name, Double price, String description, String type) {
        super(name, price, description);
        try {
            validateName(name);
            validatePrice(price);
            validateType(type);
        } catch (InvalidNameException | InvalidPriceException | MealTypeNotFound exception) {
            logger.error("Error creating Meal: " + exception.getMessage());
            throw new RuntimeException("Error creating Meal", exception);
        }
        this.type = MealType.valueOf(type);
        logger.info("Meal created: " + name + ", with price: " + price);
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
            throw new InvalidNameException("Name cannot be null or empty.");
        }
    }

    private void validateType(String providedType) throws MealTypeNotFound{
        for (MealType type:
             MealType.values()) {
            if (!type.name().equals(providedType)){
                throw new MealTypeNotFound("Wrong type of mealtype.");
            }
        }
    }
}
