package com.tka.may8;

public class SwitchExpressionExample {
	public static void main(String[] args) {

		int day = 3; // Example: 1=Monday, 2=Tuesday, ...

		String dayName = switch (day) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";
		default -> "Invalid day";
		};

		System.out.println(dayName);
	}
}