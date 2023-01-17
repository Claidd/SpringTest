package com.hunt.lesson_3_constructors.constructor;

public class EngineBike {
    private String name;

    public EngineBike(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EngineBike{" +
                "name='" + name + '\'' +
                '}';
    }
}
