package com.tka.may30;

public class Logical {

	public static int topperMarks(int[] marks) {
		
		int topper = marks[0];
		
		for(int i = 0; i < marks.length; i++) {
			if(marks[i] > topper) {
				topper = marks[i];
			}
		}
		return topper;
	}
	
	public static int[] mySort(int[] arr) {
		// Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            
        }
        return arr;
	}
	
	public static int findFrequentElement(int[] arr, int n) {
		
		int maxCount = 0; 
		for(int i = 0; i < arr.length-1; i++) {
			
			if(arr[i] == n) {
				maxCount++;
			}
		}
		return maxCount;
	}
}
