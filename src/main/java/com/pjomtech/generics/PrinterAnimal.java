package com.pjomtech.generics;

public class PrinterAnimal<T extends  Animal> {
    T thingToPrint;

    public PrinterAnimal(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        thingToPrint.eat();
        System.out.println(thingToPrint);
    }
}
