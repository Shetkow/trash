package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final String RESOURCES = "/home/paul/MyJavaProjects/Saings/BookLessons/src/main/resources/BankTranz.CSV";

        public static void main(final String... args) throws IOException {
            final Path path = Paths.get(RESOURCES + args[0]);
            final List<String> lines = Files.readAllLines(path) ;
            double total = 0d;
            for(final String line: lines) {
                final String[] columns = line.split(",");
                final double amount = Double.parseDouble(columns[1]);
                total += amount;
            }
            System.out.println("The total for all transactions is " + total);

    }
}