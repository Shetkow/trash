package org.example;

public class BinOps {
    public String sum(String a, String b) {
        try {
            int aToInt = Integer.parseInt(a, 2);
            int bToInt = Integer.parseInt(b, 2);
            int sum = aToInt + bToInt;
            return Integer.toBinaryString(sum);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Binary format plz");
        }

    }

    public String mult(String a, String b) {
        try {int aToInt = Integer.parseInt(a, 2);
            int bToInt = Integer.parseInt(b, 2);
            int mult = aToInt * bToInt;
            return Integer.toBinaryString(mult);

        } catch (NumberFormatException e){
        throw new NumberFormatException("Binary format plz");
    }

    }
}