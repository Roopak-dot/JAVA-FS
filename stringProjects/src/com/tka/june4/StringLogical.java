package com.tka.june4;

public class StringLogical {
	
	private StringLogical() {}
	
	public static int myLength(String str) {
		int length = 0;
		
		for(int i = 0; i < str.length(); i++) {
			length++;
		}
		return length;
	}
	
	public static String myReverse(String str) {
		StringBuffer rev = new StringBuffer();
		
		for(int i = str.length()-1; i >= 0; i--) {
			rev.append(str.charAt(i));
		}
		return rev.toString();
	}


}
