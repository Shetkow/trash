package org.example.myThreads;

import javax.management.ObjectName;

public class MFP {
    private final Object SCANED_MONITOR = new Object();
    private final Object PRINTED_MONITOR = new Object();

    public void scan(int count){
        synchronized (SCANED_MONITOR){

            for(int i = 0; i < count;i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Scanned " + i + " pages");
            }
        }
    }

    public void print(int count){
        synchronized (PRINTED_MONITOR){

            for(int i = 0; i < count;i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Printed " + i + " pages");
            }
        }
    }
}
