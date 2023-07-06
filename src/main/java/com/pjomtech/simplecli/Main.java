package com.pjomtech.simplecli;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while (flag) {

            System.out.println("1. Say hello");
            System.out.println("2. Say world");
            System.out.println("3. Exit");

            System.out.println("Enter choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello!!!");
                    break;

                case 2:
                    System.out.println("World!!!");
                    break;

                case 3:
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid choice:");
            }

            System.out.println("-------------\n\n\n\n");
        }

        System.out.println("Exiting...");
    }
}
