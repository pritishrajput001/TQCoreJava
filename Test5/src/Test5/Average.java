package Test5;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		float sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		float arr[] = new float[size];
		System.out.println("Enter " + size + " array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		float average = sum / size;
		System.out.println("Average of number is : " + average);
	}
}