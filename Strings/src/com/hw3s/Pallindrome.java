package com.hw3s;

import java.util.Scanner;

public class Pallindrome {

	public static void  reversestring(String s) {
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("Pallindrome");
		}
		
		else {
			System.out.println("Not Pallindrome");
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str1=sc.next();
		
		reversestring(str1);
		
		
	}
}
