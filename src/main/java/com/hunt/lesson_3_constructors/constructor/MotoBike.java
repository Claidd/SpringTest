package com.hunt.lesson_3_constructors.constructor;

public class MotoBike {
    private EngineBike engine;
    private Transmission transmission;
    private String name;

    public MotoBike(EngineBike engine, Transmission transmission, String name) {
        this.engine = engine;
        this.transmission = transmission;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MotoBike{" +
                "engine=" + engine +
                ", transmission=" + transmission +
                ", name='" + name + '\'' +
                '}';
    }
}
