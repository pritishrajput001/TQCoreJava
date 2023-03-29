package Test5;

public class SecindHighestWithoutSort {
	public static void secondHighest(int arr[]) {
		int highest = Integer.MIN_VALUE;
		int secondhg = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < highest) {
				secondhg = highest;
				highest = arr[i];
			}
			if ((arr[i] > highest) && (arr[i] < secondhg)) {
				secondhg = arr[i];
			}
		}
		System.out.println("Second Highest:" + secondhg);
	}

	public static void main(String args[]) {
		int myarr[] = { 8, 15, 22, 99, 78, 4 };
		secondHighest(myarr);
	}

}
