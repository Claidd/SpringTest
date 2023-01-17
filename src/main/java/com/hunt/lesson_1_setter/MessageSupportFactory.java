package com.hunt.lesson_1_setter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties props;
    private MessageRender render;
    private MessageProvider provider;

    public MessageSupportFactory(){
        props = new Properties();
        try {
            props.load(new FileReader("src/main/java/com/hunt/lesson_1/msf.properties"));
            String renderClass = props.getProperty("render.class");
            String providerClass = props.getProperty("provider.class");

            render = (MessageRender) Class.forName(renderClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    static {
        instance = new MessageSupportFactory();
    }
    public static MessageSupportFactory getInstance(){
        return  instance;
    }
    public MessageRender getMassageRender(){
        return render;
    }
    public MessageProvider getMassageProvider(){
        return provider;
    }
}
