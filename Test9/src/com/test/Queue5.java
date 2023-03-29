package com.test;

//Q5
import java.util.ArrayList;
import java.util.HashMap;

public class Queue5 {

	public static void findfrequencyofeachcharacter(ArrayList<Character> charlist) {
		HashMap<Character, Integer> charFreqMap = new HashMap<>();

		for (char c : charlist) {
			if (charFreqMap.containsKey(c)) {
				int freq = charFreqMap.get(c);
				charFreqMap.put(c, freq + 1);
			} else {
				charFreqMap.put(c, 1);
			}
		}

		System.out.println("Character frequency map: " + charFreqMap);
	}

	public static void main(String[] args) {
		ArrayList<Character> charList = new ArrayList<>();
		charList.add('a');
		charList.add('b');
		charList.add('a');
		charList.add('c');
		charList.add('a');
		charList.add('b');
		findfrequencyofeachcharacter(charList);

	}
}
