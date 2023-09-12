package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BinOps bin = new BinOps();
        System.out.println(bin.mult("0110", "01") + "\n"
                + bin.sum("011", "101"));
    }
}