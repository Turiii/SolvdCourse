package com.solvd.rms.models.person;

import com.solvd.rms.interfaces.person.ICustomer;
import com.solvd.rms.models.menu.MenuItem;
import com.solvd.rms.models.order.Bill;
import com.solvd.rms.models.order.Order;

import java.util.List;

public class Customer extends Person implements ICustomer {
    private Order order;
    private Double wallet = 50.0d;

    public Customer(String name) {
        super(name);
        this.order = new Order(super.getId());
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "Customer{" + super.getName()
                + ", " + super.getId()
                + "order=" + order +
                '}';
    }

    @Override
    public void makeReservation() {
        System.out.println("Making reservation...");
    }

    @Override
    public Order makeOrder(MenuItem... items) {
        order.addItems(items);
        return order;
    }

    @Override
    public Double pay() {
        return wallet;
    }
}
