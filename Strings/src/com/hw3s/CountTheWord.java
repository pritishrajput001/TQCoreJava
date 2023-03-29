package com.hw3s;

public class CountTheWord {

	public static int countWords(String s)
	{
		int ct=1;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				ct++;
		}
				
		return ct;
	}

	public static void main(String[] args) {

		String s1 = "my name is zanjad suyog";
		int count = countWords(s1);
		System.out.println(s1);
		System.out.println("Number of words:" + count);

	}

}
