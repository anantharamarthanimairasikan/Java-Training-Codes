package com.prodapt.sbresttemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.sbresttemplate.entities.College;
import com.prodapt.sbresttemplate.exception.CollegeNotFoundException;
import com.prodapt.sbresttemplate.service.CollegeService;

@RestController
public class CollegeController {
	
	@Autowired
	CollegeService service;
	
	@PostMapping("/addcollege")
	public ResponseEntity<College> addCollege(@RequestBody College college) {
		College college1 = service.addCollege(college);
		return new ResponseEntity<>(college1,HttpStatus.OK);
	}
	
	@PostMapping("/updatecollege")
	public ResponseEntity<College> updateCollege(@RequestBody College college) throws CollegeNotFoundException {
		College college1 = service.updateCollege(college);
		return new ResponseEntity<>(college1,HttpStatus.OK);
	}
	
	@GetMapping("/getcollege")
	public ResponseEntity<College> getCollege(@RequestParam("id") Integer collegeId) throws CollegeNotFoundException {
		College college1 = service.getCollege(collegeId);
		return new ResponseEntity<>(college1,HttpStatus.OK);
	}
	
	@GetMapping("/deletecollege")
	public ResponseEntity<String> deleteCollege(@RequestParam("id") Integer collegeId) throws CollegeNotFoundException {
		String message = service.deleteCollege(collegeId);
		return new ResponseEntity<>(message,HttpStatus.OK);
	}

}
