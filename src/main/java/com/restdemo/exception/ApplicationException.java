package com.restdemo.exception;

public class ApplicationException extends Exception {
	
	private static final long serialVersionUID = -5975169820914294705L;

	public ApplicationException(String errorMessage) {
		super(errorMessage);
    }
}