package com.hw3s;

import java.util.Scanner;

public class Test {

	static Scanner sc=new Scanner(System.in);
	
	public static void Display(Book b)
	{
	    
		System.out.println("Enter the book id:");
		b.setId(sc.nextInt());
		
		System.out.println("Enter the book name:");
		b.setBname(sc.next());
		
		System.out.println("Enter the book Price: ");
		b.setPrice(sc.nextFloat());
		b.setAuthor(new Author());
		System.out.println("Enter the author id: ");
		b.getAuthor().setId(sc.nextInt());
		
		System.out.println("Enter author name: ");
		b.getAuthor().setName(sc.next());
		
		
	}
	public static void main(String[] args) {

		Book b1[]=new Book[3];
		b1[0]=new Book();
		
		for(int i=0;i<b1.length;i++)
		{
			Display(b1[0]);
			System.out.println(b1[i]);
		}
	}

}
