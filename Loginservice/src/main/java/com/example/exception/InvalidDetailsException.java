package com.example.exception;

@SuppressWarnings("serial")
public class InvalidDetailsException extends Exception{
	public InvalidDetailsException(String message) {
		super(message);
	}
}