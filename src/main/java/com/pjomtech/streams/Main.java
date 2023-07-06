package com.pjomtech.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // streams using arrays
        String[] arrayOfStrings = new String[3];
        arrayOfStrings[0] = "Hello";
        arrayOfStrings[1] = "World";
        Integer[] arrayOfIntegers = {1, 2, 3};

        Arrays.stream(arrayOfStrings).forEach(System.out::println);
        Arrays.stream(arrayOfIntegers).forEach(System.out::println);

        // streams using lists
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Hello");
        listOfStrings.add("World");
        listOfStrings.add("Wrong");

        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(1);
        listOfIntegers.add(2);
        listOfIntegers.add(3);

        listOfStrings.stream().filter(word -> word.startsWith("W")).forEach(System.out::println);
        long greaterThanOne = listOfIntegers.stream().filter(number -> number > 1).count();
        System.out.println(greaterThanOne);

        List<String> collectedList = listOfStrings.stream().map(word -> word + " something else").toList();

        collectedList.forEach(System.out::println);
    }
}
