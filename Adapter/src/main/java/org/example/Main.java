package org.example;


public class Main {
    public static void main(String[] args) {
Ints calc = new IntsCalculator();
System.out.println(calc.sum(1,2) + "\n"+
        calc.mult(2,4) + "\n"+
        calc.pow(2,2)
);
    }
}