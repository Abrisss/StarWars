package com.epam.training.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.epam.training.spring.domain.Jedi;

/**
 *
 * Star Wars Application
 */
public class App {
    public static void main(final String[] args) {
        // final LightSabre lightSabre = new LightSabre("Slicer", 10);
        // final Jedi jedi = new Jedi(lightSabre);

        final BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));

        final Jedi jedi = factory.getBean(Jedi.class);

        System.out.println(jedi.fight());
    }
}
