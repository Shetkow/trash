package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callUrPet();
        context.close();
    }
}

