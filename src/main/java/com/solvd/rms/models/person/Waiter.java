package com.solvd.rms.models.person;

import com.solvd.rms.interfaces.person.IWaiter;
import com.solvd.rms.models.order.Bill;
import com.solvd.rms.models.order.Order;

public final class Waiter extends Employee implements IWaiter {
    public Waiter(String name, Double salary) {
        super(name, salary);
    }

    @Override
    public void serve(Order order) {
        System.out.println("Serving " + order.getItems() + " to customer with id = " + order.getCustomerId());
    }

    @Override
    public void cleanTable() {
        System.out.println("Cleaning table...");
    }

    @Override
    public Order takeOrder(Customer customer) {
        return customer.getOrder();
    }

    @Override
    public Bill generateBill(Order order) {
        return new Bill(order);
    }

    @Override
    public Double collectMoney(Customer customer) {
        Bill bill = generateBill(customer.getOrder());
        if(customer.pay() >= bill.getValue()){
            return customer.pay() - bill.getValue();
        }else{
            return null;
        }
    }
}
