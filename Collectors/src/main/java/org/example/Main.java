package org.example;


import java.util.Map;
import java.util.Random;
import java.util.concurrent.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final int CARS_COUNT = 3;
    private static final int CARS_COUNT_RACE = 10;
    private static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(10);
    private static final Semaphore TUNNEL_SEMAPHORE = new Semaphore(CARS_COUNT);
    private static final CyclicBarrier BARRIER = new CyclicBarrier(CARS_COUNT_RACE);
    private static final Map<Integer, Long> CARS_TIME_MAP = new ConcurrentHashMap<>();
    private static final CountDownLatch COUNT = new CountDownLatch(CARS_COUNT_RACE);
    private static int winnerIndex = -1;
    private static final Object MONITOR = new Object();

    public static void main(String[] args) {
        for (int i = 0; i < CARS_COUNT_RACE; i++) {
            final int index = i;
            EXECUTOR_SERVICE.execute(new Runnable() {
                @Override
                public void run() {
                    prepare(index);
                    try {
                        BARRIER.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (BrokenBarrierException e) {
                        throw new RuntimeException(e);
                    }
                    long start = System.currentTimeMillis();
                    roadFirst(index);
                    tunnel(index);
                    roadSecond(index);
                    synchronized (MONITOR) {
                        if (winnerIndex == -1) {
                            winnerIndex = index;
                        }
                    }
                    long fineshed = System.currentTimeMillis();
                    CARS_TIME_MAP.put(index, (fineshed - start));
                    COUNT.countDown();

                }
            });

        }
        try {
            COUNT.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int key : CARS_TIME_MAP.keySet()) {
            System.out.println(key + " " + CARS_TIME_MAP.get(key));
        }
        System.out.println("Winner " + winnerIndex + " " + CARS_TIME_MAP.get(winnerIndex));
    }

    private static void sleep() {
        Random random = new Random();
        int randomSleep = random.nextInt(1000, 5000);
        try {
            Thread.sleep(randomSleep);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void prepare(int index) {
        System.out.println("Start preparation car number " + index);
        sleep();
        System.out.println("Finished preparation  car number " + index);

    }

    private static void roadFirst(int index) {
        System.out.println("Start roadFirst car number " + index);
        sleep();
        System.out.println("Finished roadFirst  car number " + index);

    }

    private static void roadSecond(int index) {
        System.out.println("Start roadSecond car number " + index);
        sleep();
        System.out.println("Finished roadSecond  car number " + index);

    }

    private static void tunnel(int index) {
        try {
            TUNNEL_SEMAPHORE.acquire();
            System.out.println("Start tunnel car number " + index);
            sleep();
            System.out.println("Finished tunnel  car number " + index);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            TUNNEL_SEMAPHORE.release();
        }
    }
}