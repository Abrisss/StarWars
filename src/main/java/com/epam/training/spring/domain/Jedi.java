package com.epam.training.spring.domain;

public class Jedi {

    private final LightSabre lightSabre;

    public Jedi(final LightSabre lightSabre) {
        this.lightSabre = lightSabre;
    }

    public String fight() {
        return lightSabre.hit();
    }

}
