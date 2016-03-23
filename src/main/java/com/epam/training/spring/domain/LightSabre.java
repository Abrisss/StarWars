package com.epam.training.spring.domain;

public class LightSabre {

    private final String name;
    private final int damage;

    public LightSabre(final String name, final int damage) {
        super();
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "LightSabre [name=" + name + ", damage=" + damage + "]";
    }

    public String hit() {
        return "Placcs!";
    }

}
