package com.ufukucar._313_Thread_Priority;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> count(), "Thread-1");
        Thread t2 = new Thread(() -> count(), "Thread-2");
        Thread t3 = new Thread(() -> count(), "Thread-3");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }

    public static void count() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " count: " + i);

            if ( !Thread.currentThread().getName().equals("Thread-1") ) {
                Thread.yield(); // bir iş parçacağı teslim olduğunda temel yaptığı şey CPU zamanında vazgeçmektir. Yani 2 ve 3. thread ler haklarından feragat edecektir.
            }
        }
    }
}