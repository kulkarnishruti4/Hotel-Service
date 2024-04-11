package com.study.hotel.exception;


@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException() {
		super("Resource Not Found");
	}

	public ResourceNotFoundException(String message) {
		super(message);
	}
	
	
}
