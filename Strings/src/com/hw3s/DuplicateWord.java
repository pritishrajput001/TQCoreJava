package com.hw3s;

public class DuplicateWord {


		public static void CheckDuplicate(String str) {
			str = str.toLowerCase();
			String str1[] = str.split(" ");
			String words[] = str.split(" ");
			int count;
			System.out.println("Duplicate words : ");
			for (int i = 0; i < words.length; i++) {
				count = 1;
				for (int j = i + 1; j < words.length; j++) {
					if (words[i].equals(words[j])) {
						count++;
						words[j] = "visited";
					}
				}

				if (count > 1 )
					System.out.println(words[i]+" : "+count);
			}
		}

		public static void main(String[] args) {

			String str = "My name is is  is suyog suyog";
			CheckDuplicate(str);

		}

}
