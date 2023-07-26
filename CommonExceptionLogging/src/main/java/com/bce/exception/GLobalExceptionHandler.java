package com.bce.exception;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GLobalExceptionHandler extends ResponseEntityExceptionHandler {

	private static Logger log = LoggerFactory.getLogger(GLobalExceptionHandler.class);

	@ExceptionHandler(GlobalException.class)
	public ResponseEntity<Object> globalExceptionHandler(ValidationException ex) {
		log.error("GlobalException occured : {}", ex);
		GlobalErrorResponse globalErrorResponse = prepareErrorResponseEntity(ex.getErrorCode(), ex.getErrorMsg());
		return ResponseEntity.status(ex.getStatusCode()).body(globalErrorResponse);

	}

	@ExceptionHandler(GlobalRuntimeException.class)
	public ResponseEntity<Object> globalRuntimeExceptionHandler(SystemException ex) {
		log.error("GlobalRuntimeException occured : {}", ex);
		GlobalErrorResponse globalErrorResponse = prepareErrorResponseEntity(ex.getErrorCode(), ex.getErrorMsg());
		return ResponseEntity.status(ex.getStatusCode()).body(globalErrorResponse);

	}

	private GlobalErrorResponse prepareErrorResponseEntity(String errorCode, String errorMsg) {
		GlobalErrorResponse errorResponse = new GlobalErrorResponse();
		errorResponse.setError(errorMsg);
		errorResponse.setCode(errorCode);
		errorResponse.setTimeStamp(LocalDateTime.now());
		return errorResponse;

	}
}
