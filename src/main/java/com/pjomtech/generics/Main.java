package com.pjomtech.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        IntegerPrinter printer = new IntegerPrinter(23);
        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        shout("Hellow", 123);
        shout("Hello2w", 1234);

        List<Dog> list1 = new ArrayList<>();
        list1.add(new Dog());

        List<Cat> list2 = new ArrayList<>();
        list2.add(new Cat());

        printList(list1);
        printList(list2);
    }

    // generics in methods
    private static <T, V> T shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!");
        System.out.println(otherThingToShout + "!!!!1111");

        return thingToShout;
    }

    // usage of a wildcard
    private static void printList(List<? extends Animal> myList) {
        for (Object o : myList) {
            System.out.println(o);
        }
    }
}