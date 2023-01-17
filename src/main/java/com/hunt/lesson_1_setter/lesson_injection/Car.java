package com.hunt.lesson_1_setter.lesson_injection;

public class Car {
    //Для создания бина перменные обязательно должны быть приватными

    private RamaCar ramaCar;
    private Engine engine;
    private Wheels wheels;

    // Должен создаваться публичный пустой-дефолтный конструктор
    public Car(){
    }

    // Можно создать свой кончтркутор если он необходим
    public Car(RamaCar ramaCar, Engine engine, Wheels wheels) {
        this.ramaCar = ramaCar;
        this.engine = engine;
        this.wheels = wheels;
    }

    //Обязательно нужны геттеры и сетторы, если поле булин до ставится is
    public RamaCar getRamaCar() {
        return ramaCar;
    }

    public void setRamaCar(RamaCar ramaCar) {
        this.ramaCar = ramaCar;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    //Все это все, что нужно для создания бинов.
}
