package com.epam.training.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.training.spring.domain.Jedi;

/**
 *
 * Star Wars Application
 */
public class App {
    public static void main(final String[] args) {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        final Jedi jedi = context.getBean("OdanUrr", Jedi.class);
        System.out.println(jedi.fight());

        context.close();
    }
}
