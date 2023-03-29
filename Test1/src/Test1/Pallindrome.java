package Test1;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String args[]) {
		int num = 0;
		int rem, sum = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;

		}
		if (temp == num)
			System.out.println("No is pallindrome");
		else
			System.out.println("No is not pallindrome");
		sc.close();

	}

}
