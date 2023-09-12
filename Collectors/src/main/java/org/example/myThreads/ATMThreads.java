package org.example.myThreads;

public class ATMThreads {
    public static ATM atm = new ATM(3000);

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
atm.takeMoney("Pavel",200);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                atm.takeMoney("Grisha", 3000);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {

                atm.takeMoney("Yulia",1000);
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
