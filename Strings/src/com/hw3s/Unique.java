package com.hw3s;

public class Unique {

	public static void dislay(String str) {
		boolean[] visited = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!visited[c]) {
				System.out.print(c + " ");
				visited[c] = true;
			}
		}
	}

	public static void main(String[] args) {

		String str = "hello world";

		dislay(str);

	}
}
