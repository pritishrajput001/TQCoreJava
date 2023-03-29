package com.stringbuilder;

public class BufferBuilderComparasion {

	public static void timeBuffer(StringBuffer sb) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb.append("Program");
		}

		System.out.println("Time taken by stringBuffer:" + (System.currentTimeMillis() - startTime) + "ms");

	}

	public static void timeBuilder(StringBuilder sb) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb.append("Program");
		}

		System.out.println("Time taken by stringBuilder:" + (System.currentTimeMillis() - startTime) + "ms");

	}

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Java");
		timeBuffer(sb1);

		StringBuilder sb2 = new StringBuilder("Java");
		timeBuilder(sb2);

	}

}
