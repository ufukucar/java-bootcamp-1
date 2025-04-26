package com.ufukucar;

import java.util.concurrent.atomic.AtomicInteger;

public class _329_RaceConditionExample {

    // 1 public static int count = 0;
    // 2 public static AtomicInteger count = new AtomicInteger(0);

    public static int count = 0;
    public static Object lock =  new Object();

    public static void increment() {
        // 1count++; // Non-atomic increment can cause race condition
        // 2 count.incrementAndGet();
        synchronized (lock) {
            count++;
        }
    }

    public static int getCount() {
        // 1 return count;
        // 2 return count.get();

        return count;
    }

    public static void main(String[] args) throws InterruptedException {

        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        };

        Thread t1 = new Thread(incrementTask);
        Thread t2 = new Thread(incrementTask);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // 1 System.out.println("Final count (might be incorrect): " + getCount());
        System.out.println("Final count: " + getCount());
    }
}