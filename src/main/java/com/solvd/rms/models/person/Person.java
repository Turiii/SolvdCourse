package com.solvd.rms.models.person;

import java.util.Objects;

public abstract class Person {
    private String name;
    private Integer id;

    private static Integer idCounter = 0;

    public Person(String name) {
        this.name = name;
        this.id = idCounter;
        idCounter++;
    }

    public final String getName() {
        return name;
    }

    public final Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
