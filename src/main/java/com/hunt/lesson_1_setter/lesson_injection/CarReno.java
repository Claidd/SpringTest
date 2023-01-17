package com.hunt.lesson_1_setter.lesson_injection;

public class CarReno {
    private RamaCarReno ramaCarReno;
    private EngineReno engineReno;
    private WheelsReno wheelsReno;

    public CarReno(RamaCarReno ramaCarReno, EngineReno engineReno, WheelsReno wheelsReno) {
        this.ramaCarReno = ramaCarReno;
        this.engineReno = engineReno;
        this.wheelsReno = wheelsReno;
    }
}
