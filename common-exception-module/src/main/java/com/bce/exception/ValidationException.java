package com.bce.exception;

public class ValidationException extends GlobalException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValidationException(int statusCode, String errorCode) {
		super(statusCode, errorCode);
	}

	public ValidationException(String errorCode) {
		super(errorCode);
	}

	public ValidationException(String errorCode, String errorMsg) {
		super(errorCode, errorMsg);
	}

	public ValidationException(int statusCode, String errorCode, String errorMsg) {
		super(statusCode, errorCode, errorMsg);
	}

	public ValidationException(int statusCode, String errorCode, String errorMsg, Throwable e) {
		super(statusCode, errorCode, errorMsg, e);
	}

}
