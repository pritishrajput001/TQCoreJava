package com.test;

public class NegativeBalanceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1972251371290914799L;

	public NegativeBalanceException(String message) {
		super(message);
	}
}