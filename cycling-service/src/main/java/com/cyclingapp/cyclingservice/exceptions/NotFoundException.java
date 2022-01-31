package com.cyclingapp.cyclingservice.exceptions;

public class NotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	private String message;

	public NotFoundException() {
		super();
	}

	public NotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
