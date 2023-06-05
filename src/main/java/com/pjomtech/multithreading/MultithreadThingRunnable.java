package com.pjomtech.multithreading;

public class MultithreadThingRunnable implements Runnable {

    private int threadNumber;

    public MultithreadThingRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber + " using runnable");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
