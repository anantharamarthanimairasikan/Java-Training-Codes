package com.prodapt.sbrestudenttemplate2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.sbrestudenttemplate2.entitiy.Student;
import com.prodapt.sbrestudenttemplate2.exception.StudentNotFoundException;
import com.prodapt.sbrestudenttemplate2.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;

	@PostMapping("/addstudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		Student student1 = service.addStudent(student);
		return new ResponseEntity<>(student1, HttpStatus.OK);
	}

	@PostMapping("/updatestudent")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) throws StudentNotFoundException {
		Student student1 = service.updateStudent(student);
		return new ResponseEntity<>(student1, HttpStatus.OK);
	}

	@GetMapping("/getstudent")
	public ResponseEntity<Student> getStudent(@RequestParam("id") Integer studentId) throws StudentNotFoundException {
		Student student1 = service.getStudent(studentId);
		return new ResponseEntity<>(student1, HttpStatus.OK);
	}

	@GetMapping("/deletestudent")
	public ResponseEntity<String> deleteStudent(@RequestParam("id") Integer studentId) throws StudentNotFoundException {
		String message = service.deleteStudent(studentId);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}

}
