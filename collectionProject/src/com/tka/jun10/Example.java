package com.tka.jun10;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		
		//Set<Integer> hs = new HashSet<>();
		//Set<Integer> hs = new TreeSet<>();
		Set<Integer> hs = new LinkedHashSet<>();
		hs.add(10);
		hs.add(-20);
		hs.add(30);
		hs.add(10);
		hs.add(30);
		hs.add(40);
		hs.add(10);
		
		System.out.println(hs);
		
		System.out.println(hs.contains(10));
		
		for(Integer i : hs) {
			if(i < 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}