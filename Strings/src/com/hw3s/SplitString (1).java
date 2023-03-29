package ImpProgramOnString;

import java.util.Scanner;

public class SplitString {
	public static void splitWithoutMethod(String st) {
		String word = "";
		String splitstr[] = new String[20];
		int temp = 0;
		st = st + ' ';

		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) != ' ') {
				word = word + st.charAt(i);
			}

			else {
				splitstr[temp] = word;
				temp++;
				word = "";
			}
		}

		for (int i = 0; i < temp; i++) {
			System.out.println(splitstr[i]);
		}

		System.out.println("Number of words:" + temp);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a line");
		String str = sc.nextLine();
		splitWithoutMethod(str);
	}
}