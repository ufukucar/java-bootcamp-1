package com.ufukucar._321_Daemon_Threads;

public class Main {
    public static void main(String[] args) {
        Thread memoryMonitorThread = new Thread(new MemoryMonitorDaemon());
        memoryMonitorThread.setDaemon(true);
        memoryMonitorThread.start();

        Thread memoryIntensiveTaskThread = new Thread(new MemoryIntensiveTask());
        memoryIntensiveTaskThread.start();
    }
}