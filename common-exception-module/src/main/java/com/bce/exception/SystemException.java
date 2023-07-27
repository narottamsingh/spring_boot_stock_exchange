package com.bce.exception;

public class SystemException extends GlobalRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SystemException(int statusCode, String errorCode) {
		super(statusCode, errorCode);
	}

	public SystemException(String errorCode) {
		super(errorCode);
	}

	public SystemException(String errorCode, String errorMsg) {
		super(errorCode, errorMsg);
	}

	public SystemException(int statusCode, String errorCode, String errorMsg) {
		super(statusCode, errorCode, errorMsg);
	}

	public SystemException(int statusCode, String errorCode, String errorMsg, Throwable e) {
		super(statusCode, errorCode, errorMsg, e);
	}

}
