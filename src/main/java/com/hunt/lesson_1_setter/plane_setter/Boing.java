package com.hunt.lesson_1_setter.plane_setter;

public class Boing implements Plane{
    private int number;
    private int speed;
    private Pilot pilot;


    public void setNumber(int number) {
        this.number = number;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }


    @Override
    public int getAirNumber() {
        return number;
    }

    @Override
    public int getAirSpeed() {
        return speed;
    }

    @Override
    public String getAirPilot() {
        return pilot.getPilot();
    }
}
