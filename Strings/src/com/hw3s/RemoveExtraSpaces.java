package com.hw3s;

public class RemoveExtraSpaces {

	private static void removespace(String str) {
	
		System.out.println(str.trim());
		
	}
	
	public static void main(String[] args) {
		
		String str="     Remove all  the extra spaces of the string      ";
		
		
		removespace(str);
		
		
	}
}
