//WAP to print even numbers from 121 to 229 using do-while loop
package com.AssignmentLoop;

public class EvenDoWhile {
	public static void main(String args[]) {
		int i = 121, num = 229;
		while (i <= num) {
			if (i % 2 == 0) {
				System.out.println(i + "");
			}
			i++;
		}
	}

}
