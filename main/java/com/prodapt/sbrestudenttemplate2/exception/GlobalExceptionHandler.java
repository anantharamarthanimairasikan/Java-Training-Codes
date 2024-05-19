package com.prodapt.sbrestudenttemplate2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(CollegeNotFoundException.class)
	public ResponseEntity<String> handlePersonNotFoundException() {
		return new ResponseEntity<>("College not found ",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> handleStudentNotFoundException() {
		return new ResponseEntity<>("Student not found ",HttpStatus.NOT_FOUND);
	}

}
