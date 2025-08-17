package com.tka.may30;

public class Test {

	public static void main(String[] args) {
		
		int[] marks = {88, 99, 81, 77, 68};
		int[] sortedArray = Logical.mySort(marks);
		
		for(int i = 0; i<marks.length; i++) {
			System.out.print(marks[i]+ " ");
		}
		System.out.println();
		//int topperMarks = Logical.topperMarks(marks);
		
		//System.out.println("Topper marks = " +topperMarks);
		
		int[] arr = {9, 1, 2, 5, 7, 9, 2, 4, 6, 7, 8, 9, 2, 4, 5, 6, 7};
		
		int frequency = Logical.findFrequentElement(arr, 2);
		
		System.out.println("Frequency of 9 in database : " +frequency);
		System.out.println("You need to delete : " + (frequency - 1) + " elements to make it unique");

	}

}
