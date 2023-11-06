package com.solvd.rms.interfaces.person;

import com.solvd.rms.models.menu.MenuItem;
import com.solvd.rms.models.order.Bill;
import com.solvd.rms.models.order.Order;

public interface ICustomer {
    void makeReservation();
    Order makeOrder(MenuItem... items);
    Double pay();
}
