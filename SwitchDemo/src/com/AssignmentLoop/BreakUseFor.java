//WAP to show the use of break statement ( in for loop)
package com.AssignmentLoop;

public class BreakUseFor {
	public static void main(String args[]) {
		int i;
		for (i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i + "");
		}

	}

}
