package com.solvd.rms.models.person;

import com.solvd.rms.models.order.Bill;

public abstract class Employee extends Person{
    private Double salary;

    public Employee(String name, Double salary) {
        super(name);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
