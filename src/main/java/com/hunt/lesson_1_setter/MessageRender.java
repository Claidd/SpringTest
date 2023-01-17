package com.hunt.lesson_1_setter;

public interface MessageRender {
    void render();

    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
