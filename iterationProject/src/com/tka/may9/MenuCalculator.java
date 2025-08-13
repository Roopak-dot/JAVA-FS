package com.tka.may9;

import java.util.Scanner;

public class MenuCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice;

		do {
			System.out.print("Enter first number: ");
			double num1 = sc.nextDouble();

			System.out.print("Enter an operator (+, -, *, /): ");
			char op = sc.next().charAt(0);

			System.out.print("Enter second number: ");
			double num2 = sc.nextDouble();

			// Using Java 14+ switch expression
			String result = switch (op) {
			case '+' -> "Result: " + (num1 + num2);
			case '-' -> "Result: " + (num1 - num2);
			case '*' -> "Result: " + (num1 * num2);
			case '/' -> (num2 != 0) ? "Result: " + (num1 / num2) : "Error: Division by zero";
			default -> "Invalid operator!";
			};

			System.out.println(result);

			System.out.print("Do you want to perform another calculation? (y/n): ");
			choice = sc.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');

		sc.close();
		System.out.println("Calculator closed.");
	}
}
