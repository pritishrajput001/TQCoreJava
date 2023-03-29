package com.test;

@SuppressWarnings("serial")
class InvalidVotingAgeException extends Exception {
	public InvalidVotingAgeException(String message) {
		super(message);
	}
}