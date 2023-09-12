package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Thread{
    public void go() { System.out.println( "Go!" ); }



    public void begin() { System.out.println( "Begin!" ); }

    public void execute() { System.out.println( "Execute!" ); }

    public static void main(String[] args) {
System.out.println(args[0]);
    }
}