package com.solvd.rms.interfaces.person;

import com.solvd.rms.models.menu.MenuItem;
import com.solvd.rms.models.order.Bill;
import com.solvd.rms.models.order.Order;
import com.solvd.rms.models.person.Customer;

public interface IWaiter {
    void serve(Order order);
    void cleanTable();
    Order takeOrder(Customer customer);
    Bill generateBill(Order order);
    Double collectMoney(Customer customer);
}
