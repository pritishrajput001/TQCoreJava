package com.hw3s;

import java.util.Arrays;

public class SplitequalsPart {
	
	public static void  eqalpartdisplay(String s)
	{
		int len=s.length();
		int n=3;
		
		int noofchar=len/n;
		
		String []split=new String[n];
		
		int temp=0;
		if(len%n!=0)
		{
			System.out.println("Cannot divide the string int  equal part");
		}
		
		else {
			for(int i=0;i<s.length();i+=noofchar)
			{
				split[temp]=s.substring(i,i+noofchar);
				temp++;
			}
		}
		System.out.println(s);
		System.out.println(Arrays.toString(split));
	}

	public static void main(String[] args) {

		String str="Programminyg";
		eqalpartdisplay(str);
	}

}
