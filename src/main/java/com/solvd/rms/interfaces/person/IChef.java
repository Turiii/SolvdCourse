package com.solvd.rms.interfaces.person;

import com.solvd.rms.models.menu.Meal;

public interface IChef {
    void cook(Meal... meals);
}
