package com.hunt.lesson_3_constructors.constructor;

public class Transmission {
    private String name;

    public Transmission(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "name='" + name + '\'' +
                '}';
    }
}
