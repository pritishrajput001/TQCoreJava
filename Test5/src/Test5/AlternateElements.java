package Test5;

public class AlternateElements {
	public static void print(int arr1[], int arr2[]) {
		int i = 0, j = 0;
		while (i < arr1.length && j < arr2.length) {
			System.out.println(arr1[i] + " ");
			System.out.println(arr2[j] + " ");

			i++;
			j++;
		}
		while (i < arr1.length) {
			System.out.println(arr1[i] + " ");
			i++;
		}
		while (i < arr2.length) {
			System.out.println(arr2[j] + " ");
		}
	}

}
