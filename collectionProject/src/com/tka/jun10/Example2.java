package com.tka.jun10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Example2 {

	public static void main(String[] args) {
		int count = 0;
		List<Integer> marksdb = Arrays.asList(77, 92, 39, 54, 92, 85, 66, 88, 50, 44, 10);
		Set<Integer> sortedmarks = new TreeSet<>(marksdb);
		List<Integer> sortedmarksList = new ArrayList<>(sortedmarks);
		
		System.out.println("Topper marks = " +sortedmarksList.get(sortedmarksList.size()-1));
		System.out.println("Lowest marks = " +sortedmarksList.get(0));
		
		for(Integer mark : marksdb) {
			if(mark == sortedmarksList.get(sortedmarksList.size()-1)) {
				count++;
			}
		}
		System.out.println("Number of students with top marks = " +count);
		

	}

}
