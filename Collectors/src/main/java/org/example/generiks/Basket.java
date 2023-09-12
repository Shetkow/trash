package org.example.generiks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Basket<U extends Fruit> {
    List<U> arr;

    public Basket() {
        arr = new ArrayList<>();
    }

    private float getWeight() {
        float result = 0;
        for (U fruit : arr) {
            result += fruit.getWeight();
        }
        return result;
    }

    private void add(U fruit) {
        arr.add(fruit);
    }

    private int compare(Basket<?> another) {
//        if (getWeight() <another.getWeight()) {
//            return 1;
//        } else if (getWeight() == another.getWeight()) {
//            return 0
//
//        }else {
//            return -1;
//        }
        return Float.compare(this.getWeight(),another.getWeight());
    }
    public <U extends Fruit> void trasfer(Basket<? extends U> src,Basket<? super U> dst){
       dst.arr.addAll(src.arr);
       src.arr.clear();


    }

}
