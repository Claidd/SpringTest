package com.hunt.lesson_1_setter.plane_setter;

public class PilotJohn implements Pilot {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPilot() {

        return name;
    }
}
