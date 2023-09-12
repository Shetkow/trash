package org.example.start;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog  implements Pet{
    @Override
    public void say(){
        System.out.println("Wow-wow");
    }

    public void init(){
        System.out.println("init method DOg");
    }
    public void destroy(){
        System.out.println("destroy method Dog");
    }
}
