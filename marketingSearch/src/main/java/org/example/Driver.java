package org.example;

public class Driver extends Person implements Worker{
    @Override
    public void work() {
System.out.println("I am work");
    }
}
