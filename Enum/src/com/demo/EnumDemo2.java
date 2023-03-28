package com.demo;

public class EnumDemo2 {
	public enum WeekDays {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String args[]) {
		for (WeekDays d : WeekDays.values()) {
			System.out.println(d);
		}
		System.out.println("Ordinal of Friday:" + WeekDays.FRIDAY.ordinal());
	}

}
