package com.solvd.rms.interfaces.person;

import com.solvd.rms.models.person.Employee;

public interface IBoss {
    void changeSalaryForEmployee(Employee employee, Double newSalary);
}
