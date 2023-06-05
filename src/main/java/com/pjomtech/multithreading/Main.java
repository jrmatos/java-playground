package com.pjomtech.multithreading;

import com.pjomtech.generics.IntegerPrinter;
import com.pjomtech.generics.Printer;
import com.pjomtech.multithreading.MultithreadThing;
import com.pjomtech.multithreading.MultithreadThingRunnable;

public class Main {
    public static void main(String[] args) {
//         Using extends you have a simpler way to call create a thread, but your thread class can't extend any
//         other class due to Java not accepting multiple inheritance
        for (int i = 0; i < 3; i++) {
            MultithreadThing myThing = new MultithreadThing(i);
            myThing.start();
        }
//         Using the Runnable interface you can still extend the thread class from any other class + also implement
//         more interfaces, of course
        for (int i = 0; i < 3; i++) {
            MultithreadThingRunnable myThing = new MultithreadThingRunnable(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
//            myThread.join();
//            myThread.isAlive();
        }
    }
}