package com.restdemo.exception;

public class DepartmentException extends Exception {
	private static final long serialVersionUID = -5637100568235414609L;

	public DepartmentException(String errorMessage) {
        super(errorMessage);
    }
}