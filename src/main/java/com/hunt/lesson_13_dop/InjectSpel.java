package com.hunt.lesson_13_dop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InjectSpel {
    /*Так внедряются поля из другого класса*/
    @Value("#{injectConfig.name}")
    private String name;
    @Value("#{injectConfig.age}")
    private int age;
    /*Тренарный оператор, который проверяет если тру то первое значени, если нет то второй*/
    @Value("#{injectConfig.programmer == true ? 'Yes' : 'No'}")
    private String programmer;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    @Override
    public String toString() {
        return "InjectSpel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", programmer='" + programmer + '\'' +
                '}';
    }
}
