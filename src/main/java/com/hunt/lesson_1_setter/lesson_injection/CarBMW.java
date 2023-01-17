package com.hunt.lesson_1_setter.lesson_injection;

public class CarBMW  {
    private RamaCarBMW ramaCar;
    private EngineBMW engine ;
    private WheelsBMW wheels ;

    public CarBMW(RamaCarBMW ramaCar, EngineBMW engine, WheelsBMW wheels) {
        this.ramaCar = ramaCar;
        this.engine = engine;
        this.wheels = wheels;
    }
}
