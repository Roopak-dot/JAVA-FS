package com.tka.jun11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CHashMap {

	public static void main(String[] args) {
		Map<String, List<String>> movies_2025db = new HashMap<>();
		List<String> casting1 = Arrays.asList("RD", "AK", "AB", "JF", "SB");
		List<String> casting2 = Arrays.asList("AD", "AH", "AN", "SF", "MB");

		movies_2025db.put("Housefull5", casting1);
		movies_2025db.put("Dhamaal", casting2);
		
		System.out.println(movies_2025db);
		System.out.println(movies_2025db.size());
		
	}
}
