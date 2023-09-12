package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog implements Pet{
    public Dog(){

    }
    @Override
    public void say() {
System.out.println("Bow-Wow");
    }

   @PostConstruct
    public void init(){
        System.out.println("Class Dog init-method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Dog destroy-method");
    }
}
