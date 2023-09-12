package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("dog")
    private Pet pet;
    private String surname;
//   @Value("${person.age}")
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Set surName");
        this.surname = surname;
    }

    public int getAge() {
        System.out.println(age);
        return age;
    }

    public void setAge(int age) {
        System.out.println("Set age");
        this.age = age;
    }

    public Person() {
    }

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Bean is created");
        this.pet = pet;
    }
    public void callUrPet(){
        System.out.println("Hello,my Pet!");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("Set pet");
        this.pet = pet;
    }
}
