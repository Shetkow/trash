package org.example.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
      Person person = context.getBean("personBean",Person.class);
      person.callPet();
      System.out.println(person.getName() + " " + person.getAge());

    }
}
