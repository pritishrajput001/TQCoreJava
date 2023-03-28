package com.demo;

public class MultiCatch2 {
	public static void main(String args[]) {
		String arr[] = { "Java", "Python", null, "DevOps" };
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i].length());
			}
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e)

		{
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			System.out.println("String array");
		}
	}

}
