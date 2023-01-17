package com.hunt.lesson_1_setter;

public class HelloWorldFecupledWithFactory {
    public static void main(String[] args) {
        MessageRender mr = MessageSupportFactory.getInstance().getMassageRender();
        MessageProvider mp = MessageSupportFactory.getInstance().getMassageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
