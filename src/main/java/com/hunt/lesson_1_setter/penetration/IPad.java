package com.hunt.lesson_1_setter.penetration;

public class IPad implements Device{
    private String model;
    @Override
    public String getModelDevice() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
