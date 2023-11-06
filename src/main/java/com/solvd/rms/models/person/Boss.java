package com.solvd.rms.models.person;

import com.solvd.rms.interfaces.person.IBoss;

public final class Boss extends Person implements IBoss {
    public Boss(String name) {
        super(name);
    }

    @Override
    public void changeSalaryForEmployee(Employee employee, Double newSalary) {
        employee.setSalary(newSalary);
    }
}
