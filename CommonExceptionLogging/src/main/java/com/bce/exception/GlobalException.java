package com.bce.exception;

import java.util.ArrayList;
import java.util.List;

public class GlobalException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String errorCode;
	private String errorMsg;
	private Integer statusCode;
	private List<String> errorParams;

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public List<String> getErrorParams() {
		return errorParams;
	}

	public GlobalException(String errorCode) {
		this.errorCode = errorCode;
		this.errorMsg = null;
		this.statusCode = null;
		this.errorParams = new ArrayList<String>();

	}

	public GlobalException(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.statusCode = null;
		this.errorParams = new ArrayList<String>();

	}

	public GlobalException(int statusCode, String errorCode) {
		this.statusCode = statusCode;
		this.errorCode = errorCode;
		this.errorMsg = null;
		this.errorParams = new ArrayList<String>();

	}

	public GlobalException(int statusCode, String errorCode, String erroMsg) {
		this.statusCode = statusCode;
		this.errorCode = errorCode;
		this.errorMsg = erroMsg;
		this.errorParams = new ArrayList<String>();

	}

	public GlobalException(int statusCode, String errorCode, String erroMsg, Throwable e) {
		super(erroMsg, e);
		this.statusCode = statusCode;
		this.errorCode = errorCode;
		this.errorMsg = erroMsg;
		this.errorParams = new ArrayList<String>();

	}
}
