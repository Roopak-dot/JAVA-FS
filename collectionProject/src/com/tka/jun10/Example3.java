package com.tka.jun10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example3 {

	public static void main(String[] args) {
	List<Integer> students = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	List<Integer> attendence = Arrays.asList(5, 7, 2, 1, 5, 5, 2, 6, 9);
	Set<Integer> uniattendence = new HashSet<>(attendence);
	Set<Integer> absent = new HashSet<>(students);
	absent.removeAll(uniattendence);
	
	System.out.println("Total no of students who attended the class " +(uniattendence.size()));
	System.out.println("Roll no of students who attended the class " +uniattendence);
	System.out.println("Roll no of absent students " +absent);
	
	}
}
