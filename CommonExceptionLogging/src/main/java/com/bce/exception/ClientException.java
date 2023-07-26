package com.bce.exception;

public class ClientException extends GlobalRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClientException(int statusCode, String errorCode) {
		super(statusCode, errorCode);
	}

	public ClientException(String errorCode) {
		super(errorCode);
	}

	public ClientException(String errorCode, String errorMsg) {
		super(errorCode, errorMsg);
	}

	public ClientException(int statusCode, String errorCode, String errorMsg) {
		super(statusCode, errorCode, errorMsg);
	}

	public ClientException(int statusCode, String errorCode, String errorMsg, Throwable e) {
		super(statusCode, errorCode, errorMsg, e);
	}

}
