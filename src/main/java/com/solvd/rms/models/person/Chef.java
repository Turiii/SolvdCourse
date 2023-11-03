package com.solvd.rms.models.person;

import com.solvd.rms.interfaces.person.IBoss;
import com.solvd.rms.interfaces.person.IChef;
import com.solvd.rms.models.menu.Meal;

public class Chef extends Employee implements IChef {

    public Chef(String name, Double salary) {
        super(name, salary);
    }

    @Override
    public void cook(Meal... meals) {
        for (Meal meal:
             meals) {
            meal.cook();
        }
    }
}
