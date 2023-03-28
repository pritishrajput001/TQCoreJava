package com.demo2;

import java.io.IOException;

public class ExceptionPropogation {
	static void exe() throws IOException {
		throw new IOException("Error in device");
	}

	static void p() throws IOException {
		exe();
	}

	static void n() throws IOException {
		p();
	}

	public static void main(String args[]) {
		try {
			n();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
