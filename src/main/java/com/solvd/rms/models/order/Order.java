package com.solvd.rms.models.order;

import com.solvd.rms.models.menu.MenuItem;

import java.util.Arrays;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Order {

    private Integer customerId;
    private List<MenuItem> items;
    private Double value;

    public Order(Integer customerId) {
        this.customerId = customerId;
    }

    public void addItems(MenuItem... itemsToAdd) {
        items.addAll(List.of(itemsToAdd));
    }

    public void removeItem(MenuItem... itemsToRemove) {
        items.removeAll(List.of(itemsToRemove));
    }

    public final Integer getCustomerId() {
        return customerId;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public Double getValue() {
        return value;
    }
}
