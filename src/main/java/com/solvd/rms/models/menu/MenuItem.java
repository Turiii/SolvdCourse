package com.solvd.rms.models.menu;

import com.solvd.rms.interfaces.menu.Nameable;
import com.solvd.rms.interfaces.menu.Priceable;

public abstract class MenuItem implements Nameable, Priceable {
    private Integer id;
    private String name;
    private Double price;
    private String description;
    private static Integer idCounter = 0;

    public MenuItem(String name, Double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.id = idCounter;
        idCounter++;
    }

    public final Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
