package com.hunt.lesson_1_setter.lesson_injection;

public class Test {
    public static void main(String[] args) {
        RamaCarBMW ramaCarBMW = new RamaCarBMW();
        EngineBMW engineBMW = new EngineBMW();
        WheelsBMW wheelsBMW = new WheelsBMW();

        RamaCarReno ramaCarReno = new RamaCarReno();
        EngineReno engineReno = new EngineReno();
        WheelsReno wheelsReno = new WheelsReno();

        Car carBMW = new Car(ramaCarBMW, engineBMW, wheelsBMW);
        Car carReno = new Car(ramaCarReno, engineReno, wheelsReno);
    }
}
