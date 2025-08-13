package com.tka.may9;

import java.util.Scanner;

public class Calculator1 {
    Scanner sc = new Scanner(System.in);

    void addition() {
        System.out.println("Please enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition: " + (a + b));
    }

    void subtraction() {
        System.out.println("Please enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Subtraction: " + (a - b));
    }

    void multiplication() {
        System.out.println("Please enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Multiplication: " + (a * b));
    }

    void division() {
        System.out.println("Please enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Error: Division by zero");
        }
    }

    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();
        char choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.print("Enter choice number: ");
            int var = calc.sc.nextInt();

            switch (var) {
                case 1 -> calc.addition();
                case 2 -> calc.subtraction();
                case 3 -> calc.multiplication();
                case 4 -> calc.division();
                default -> System.out.println("Invalid entry");
            }

            System.out.print("Do you want to perform another calculation? (y/n): ");
            choice = calc.sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        calc.sc.close();
        System.out.println("Calculator closed.");
    }
}