package com.kony.employee.exceptions;

public class EmployeeException extends RuntimeException{
	
	private static final long serialVersionUID=1L;

    public EmployeeException(String message) {
        super(message);
    }

    public EmployeeException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeException(Throwable cause) {
        super(cause);
    }
}