package com.solvd.rms.models.person;

import com.solvd.rms.interfaces.person.IChef;

public final class HeadChef extends Chef implements IChef {
    public HeadChef(String name, Double salary) {
        super(name, salary);
    }

    void cookChefSpecial(){
        System.out.println("Headchef cooking special...");
    }
}
