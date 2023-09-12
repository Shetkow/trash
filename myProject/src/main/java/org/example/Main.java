package org.example;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
Parrot p = context.getBean(Parrot.class);
p.setName("Koko");
        Supplier<Parrot> supplier = ()->p;

        context.registerBean("parrotBeam", Parrot.class,supplier);

        }
    }
