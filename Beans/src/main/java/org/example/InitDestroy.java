package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroy {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Pet dog = context.getBean("myPet", Dog.class);
        dog.say();
        context.close();
    }
}
