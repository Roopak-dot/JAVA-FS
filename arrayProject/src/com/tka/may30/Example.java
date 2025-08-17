package com.tka.may30;

public class Example {

	public static void main(String[] args) {
		
		int[] marks = new int[5];
		
		int arr1[] = {12, 28, 83, 94, 55};
		int[] arr2 = new int[5];
		
		arr2[0] = -89;
		arr2[1] = arr1[4];
		arr2[2] = arr1[4] + arr1[0];
		arr2[3] = arr1[4] * arr1[0];
		arr2[4] = arr1[4] / arr1[0];
		
		//System.out.println(arr2[3]);
		
		//System.out.println(arr1.length);
		//System.out.println(arr2.length);

		//System.out.println(arr1[0]);
		//System.out.println(arr1[4]);
		//System.out.println(arr1[0] + arr1[4]);
		
		//How to iterate through an array
		
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] % 2 == 0)
			System.out.println(i + " -> " + arr1[i]);
		}
	}

}
