package com.loop;

public class AlternateSum {
	public static void main(String args[]) {
		int i, num = 10;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter number");
		// num = sc.nextInt();
		for (i = 1; i <= num; i++) {
			if (i == 10) {

				System.out.print(i + "  ");
				i += 2;
			}
		}
	}

}
