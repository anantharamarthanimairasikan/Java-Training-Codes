package com.prodapt.sbresttemplate.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(CollegeNotFoundException.class)
	public ResponseEntity<String> handlePersonNotFoundException() {
		return new ResponseEntity<>("Person not found ",HttpStatus.NOT_FOUND);
	}

}
