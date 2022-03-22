package com.design.strategy;

public class AppendStrategy implements EncofingStrategy{

    @Override
    public String encode(String text) {
        
        return "ABCD" + text;
    }
}
