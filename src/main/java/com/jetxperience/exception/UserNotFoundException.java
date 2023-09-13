package com.jetxperience.exception;

public class UserNotFoundException extends RuntimeException {
	
	private final int httpStatusCode;

	public UserNotFoundException(String message, int httpStatusCode) {
        super(message);
        this.httpStatusCode = httpStatusCode;
    }
	
	public int getHttpStatusCode() {
		return httpStatusCode;
	}
}