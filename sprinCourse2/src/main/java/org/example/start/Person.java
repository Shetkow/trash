package org.example.start;

import org.springframework.beans.factory.annotation.Value;

//@Component("personBean")
public class Person {
    private Pet pet;

   @Value("${person.name}")
    private String name;

   private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


//   @Autowired
//    public Person(@Qualifier("dogBean") Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }


    public void setName(String name) {
        System.out.println("Class person:set name");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("Class person:set age");
        this.age = age;
    }

    public Person() {
        System.out.println("Создаем класс персон с помощью spring");
    }

//   @Autowired
    public void setPet(Pet pet) {
        System.out.println("Передаем pet через сеттер с помощью spring");
        this.pet = pet;
    }

    public void callPet() {
        pet.say();
        System.out.println("Hello my lovely Pet!1");
    }

}
