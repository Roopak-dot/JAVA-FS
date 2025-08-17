package com.tka.june4;

public class Test {

	public static void main(String[] args) {

		String s1 = "INSTAGRAM";

		int len = StringLogical.myLength(s1);
		String reversed = StringLogical.myReverse(s1);

		System.out.println(len);
		System.out.println(reversed);

		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				count++;
			}

		}
		System.out.println("\nNumber of vowels in the string: " + count);
	}

}
