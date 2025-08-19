package com.tka.jun13;

public class Example {
	
	public static void main(String[] args) {
		
		int[] ar1 = {1, 2, 3, 4, 5};
		int[] ar2 = {1, 2, 0, 4, 5};
		
		System.out.println(4/4);
		System.out.println(4/2);
		try {
		System.out.println(ar1[3] / ar2[5]); //Arithmetic Exception: /by zero
		} catch(ArithmeticException e) {
			
			//System.out.println(e);
			e.printStackTrace();
			System.out.println("Infnity");
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array Index Out of Bounds");
			System.out.println(4/0);
		} //Feature : Multiple Catch Blocks in Java 8
		finally {
			System.out.println("Finally Block");
		}
		System.out.println(4/3);
		System.out.println(4/1);
	}
}
