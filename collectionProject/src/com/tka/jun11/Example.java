package com.tka.jun11;

import java.util.HashMap;
import java.util.Map;

public class Example {
	public static void main(String[] args) {
	Map<Integer, String> studentsdb = new HashMap<>();
	studentsdb.put(1, "Aakash");
	studentsdb.put(2, "Rahul");
	studentsdb.put(3, "Sumit");
	studentsdb.put(20, "Rohan");
	studentsdb.put(30, "Tushar");
	
	System.out.println(studentsdb);
	System.out.println(studentsdb.get(1));
	System.out.println(studentsdb.get(111));
	System.out.println(studentsdb.keySet());
	
	for(Integer roll : studentsdb.keySet()) {
		System.out.println(roll+ " --> " +studentsdb.get(roll));
	}
	}
}
