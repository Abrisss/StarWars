package com.epam.training.spring.domain;

public class Jedi {

    private final LightSabre lightsabre;

    public Jedi() {
        lightsabre = new LightSabre("Slicer", 10);
    }

    public String fight() {
        return lightsabre.hit();
    }

}