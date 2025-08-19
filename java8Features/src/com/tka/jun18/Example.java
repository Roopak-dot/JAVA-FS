package com.tka.jun18;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {

		List<Integer> marks = Arrays.asList(88, 99, 76, 91, 66);

		// stream API MAP method

		List<Integer> gracemarks = marks.stream().map(m -> {
			if (m < 95) {
				return m + 5;
			} else {
				return m;
			}
		}).collect(Collectors.toList());

		System.out.println("Marks before grace " + marks);
		System.out.println("Marks after grace " + gracemarks);

		// stream API filter method
		List<Integer> topperlist = marks.stream().filter(m -> m < 90).collect(Collectors.toList());
		System.out.println("Topper List :" + topperlist);

		// stream API reduce method
		int sum = marks.stream().reduce(0, (a, b) -> a + b);

		System.out.println(sum);

		// Predicate
		Predicate<String> sizegreater5 = s -> s.length() > 5;
		System.out.println(sizegreater5.test("Instagram"));
		
		Predicate<String> startswithI = s -> s.startsWith("I");
		System.out.println(startswithI.test("Instagram"));
		
		Predicate<String> startswithIandlength = sizegreater5.and(startswithI);
		System.out.println(startswithIandlength.test("Instagram"));
	}

}
