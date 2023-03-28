package com.demo3;

import java.util.Scanner;

public class BinaryNumException {

	public void showBinary(long num)throw BinaryNumException 
	{
		if(num!=0||1)
			throw new BinaryNumException("Enter only binary value");
		
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary num");
		long num = sc.nextLong();

	}

}
