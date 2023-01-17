package com.hunt.lesson_1_setter;

public class StandartMessageRender implements MessageRender {
    private  MessageProvider messageProvider;
    @Override
    public void render() {
        if (messageProvider == null){
            throw new RuntimeException("You must set messageProvider");
        }
        System.out.println(messageProvider.getMassage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }


}
