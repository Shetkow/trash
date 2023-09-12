package MultiThreading;

import java.util.Random;

public class Main {
    static boolean isFive = false;
    static Random rnd = new Random();


    public static void main(String[] args) {
        int rndInt1 = rnd.nextInt(1, 100);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int rndInt2;
                do {
                    rndInt2 = rnd.nextInt(1, 100);
                } while (rndInt1 != rndInt2);
                isFive = true;
                System.out.println(rndInt2);


            }
        });
        thread.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000_0; i++) {
                    System.out.println(i);
                    if (isFive) {
                        break;
                    }


                }

            }
        });
        thread2.start();
    }

}
