package org.example.myThreads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ATM {
    private int money = 3000;

    private final Object MONITOR = new Object();


    public ATM(int money) {
        this.money = money;
    }


    public void takeMoney(String name, int money) {
        System.out.println(name + " подошел к банкомату");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (MONITOR) {
            if (money <= this.money) {
                this.money -= money;
                System.out.println(name + " Выввел " + money);
                System.out.println("на счету осталось " + this.money);
            } else {
                System.out.println("Превышен лимит! на счете не достаточно денег для " + name);
            }
        }
    }
}

