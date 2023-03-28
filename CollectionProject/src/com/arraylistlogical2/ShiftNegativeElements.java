package com.arraylistlogical2;

import java.util.ArrayList;
import java.util.Scanner;

public class ShiftNegativeElements {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> alist = new ArrayList<>();

		System.out.println("Enter elements");
		for (int i = 0; i < 8; i++) {
			alist.add(sc.nextInt());
		}

		ArrayList<Integer> nlist = new ArrayList<>();

		for (int i = 0; i < alist.size(); i++) {
			if (alist.get(i) >= 0) {
				nlist.add(alist.get(i));
			}
		}

		for (int i = 0; i < alist.size(); i++) {
			if (alist.get(i) < 0) {
				nlist.add(alist.get(i));
			}
		}

		System.out.println(alist);
		System.out.println(nlist);
		sc.close();
	}

}
