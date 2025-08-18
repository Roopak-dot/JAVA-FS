package com.tka.jun9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Example {

	public static void main(String[] args) {

		// ArrayList<Integer> salary_list = new ArrayList<>();
		// Vector<Integer> salary_list = new Vector<>();
		LinkedList<Integer> salary_list = new LinkedList<>();

		// Wrapper class in java

		salary_list.add(25000);
		salary_list.add(30000);
		salary_list.add(33000);
		salary_list.add(45000);
		salary_list.add(12000);
		salary_list.add(3000);
		
		//Displaying the contents of ArrayList
		System.out.println("Salary List: " +salary_list);
		
		//System.out.println(salary_list.size());
		for(int i  = 0; i<salary_list.size(); i++) {
			if(salary_list.get(i) > 25000) {
				System.out.println(salary_list.get(i));
			}
			
		}
		
		//Enhanced for loop
		for(Integer data : salary_list) {
			if(data > 25000)
				System.out.println(data);
		}

	}
}
