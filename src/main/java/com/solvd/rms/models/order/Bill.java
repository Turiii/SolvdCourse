package com.solvd.rms.models.order;

public class Bill {
    private Order order;
    private Integer id;
    private Double value;
    private static Integer idCounter = 0;

    public Bill(Order order) {
        this.order = order;
        this.value = order.getValue() * 0.10;
        this.id = idCounter;
        idCounter++;
    }

    public Integer getId() {
        return id;
    }

    public Double getValue() {
        return value;
    }
}
