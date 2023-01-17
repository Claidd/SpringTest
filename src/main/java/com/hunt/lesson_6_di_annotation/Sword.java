package com.hunt.lesson_6_di_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sword {
    private String title;
    private int damage;

    public Sword(@Value("Mech") String title, @Value("50") int damage) {
        this.title = title;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "title='" + title + '\'' +
                ", damage=" + damage +
                '}';
    }
}
