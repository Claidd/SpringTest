package com.hunt.lesson_1_setter;

public class HelloWorldDecoupled {
    public static void main(String[] args) {
        MessageRender mr = new StandartMessageRender();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
