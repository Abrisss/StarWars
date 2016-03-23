package com.epam.training.spring;

import com.epam.training.spring.domain.Jedi;

/**
 * Star Wars Application
 *
 */
public class App {
    public static void main(final String[] args) {
        final Jedi jedi = new Jedi();
        System.out.println(jedi.fight());
    }
}
