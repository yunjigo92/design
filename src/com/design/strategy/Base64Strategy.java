package com.design.strategy;

import java.util.Base64;

public class Base64Strategy implements EncofingStrategy{

    @Override
    public String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
    
}
