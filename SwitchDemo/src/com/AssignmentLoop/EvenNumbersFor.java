//WAP to print even numbers from 121 to 229 using for loop. 
package com.AssignmentLoop;

public class EvenNumbersFor {
	public static void main(String args[]) {
		int i, num = 229;
		for (i = 121; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
