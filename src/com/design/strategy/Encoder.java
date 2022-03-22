package com.design.strategy;

public class Encoder {
    private EncofingStrategy encofingStrategy;

    public String getMessage(String message){
        return this.encofingStrategy.encode(message);
    }

    public void setEncodingStrategy(EncofingStrategy encofingStrategy){
        this.encofingStrategy =encofingStrategy;
    }
}
