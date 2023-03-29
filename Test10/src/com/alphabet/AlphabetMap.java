package com.alphabet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AlphabetMap {

	public static void main(String[] args) {
		ArrayList<String> alphabetList = new ArrayList<>();
		alphabetList.add("A+2");
		alphabetList.add("B+12");
		alphabetList.add("D+4");
		alphabetList.add("DD+5");

		HashMap<Character, Integer> alphabetMap = new HashMap<>();

		for (String s : alphabetList) {
			char alphabet = s.charAt(0);
			int value = Integer.parseInt(s.substring(2));

			if (alphabetMap.containsKey(alphabet)) {
				value += alphabetMap.get(alphabet);
			}
			alphabetMap.put(alphabet, value);
		}

		for (Map.Entry<Character, Integer> entry : alphabetMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}