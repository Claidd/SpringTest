package com.hunt.lesson_4_di;

import org.springframework.stereotype.Component;

@Component
public class FrameOwn {
    private String name = "BMW";

//    public FrameOwn(String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "FrameOwn{" +
                "name='" + name + '\'' +
                '}';
    }
}
