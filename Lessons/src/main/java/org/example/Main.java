package org.example;

import Abstract.Rectangle;
import Abstract.Triangle;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        List<Integer> integerList = new ArrayList<>();
//        List<String> stringList = new ArrayList<>();
//        List<String> combine = new ArrayList<>();
//        integerList.add(0);
//        integerList.add(1);
//        integerList.add(2);
//
//        stringList.add("Julia");
//        stringList.add("Pasha");
//        stringList.add("Marta");
//
//        for(int i = 0; i < stringList.size();i++){
//            combine.add(integerList.get(i) +" - "+ stringList.get(i));
//            System.out.println(combine.get(i));
//        }
//
//    }
//
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int a = random.nextInt(10, 20);
            if (a % 2 !=0) {
                System.out.print(a + " ");
            }
        }
    }

}
