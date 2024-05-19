package com.prodapt.sbrestudenttemplate2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;

import com.prodapt.sbrestudenttemplate2.entitiy.College;
import com.prodapt.sbrestudenttemplate2.entitiy.ResponseValue;
import com.prodapt.sbrestudenttemplate2.entitiy.Student;
import reactor.core.publisher.Mono;

@RestController
public class MainController {
	@Autowired
	private WebClient webClient;

	@PostMapping("/addstudetails")
	public ResponseEntity<ResponseValue> addStudent(@RequestBody ResponseValue responses) {
	    String link = "http://localhost:9091/addstudent";
	    String link1 = "http://localhost:9090/addcollege";
	    ResponseValue response = new ResponseValue();

	    College clg = webClient.post().uri(link1)
	            .bodyValue(responses.getCollege())
	            .retrieve()
	            .bodyToMono(College.class).block();

	    Student stud = webClient.post().uri(link)
	            .bodyValue(responses.getStudent())
	            .retrieve()
	            .bodyToMono(Student.class).block();
	    if( clg!=null && stud!=null) {
	    	response.setCollege(clg);
	    	response.setStudent(stud);
	    }else {
	    	response.setCollege(null);
	    	response.setStudent(null);
	    }

	    return new ResponseEntity<>(response,HttpStatus.OK);
	}

	@GetMapping("/getstudentdetails")
	public ResponseEntity<ResponseValue> getStudent(@RequestParam("id") Integer studentId) {
	    String link = "http://localhost:9091/getstudent?id={id}";
	    String link1 = "http://localhost:9090/getcollege?id={id}";
	    ResponseValue response = new ResponseValue();

	    Optional<Student> student = Optional.ofNullable(webClient.get().uri(link,studentId).retrieve().bodyToMono(Student.class).block());
		College clg =null;
		if(student.isPresent()) {
			if(student.get().getCollegeId()!=null) {
				 clg = webClient.get().uri(link1,student.get().getCollegeId()).retrieve().bodyToMono(College.class).block();
			}
			if(student!=null && clg!=null) {
				response.setCollege(clg);
				response.setStudent(student.get());
			}else {
				response.setCollege(null);
		    	response.setStudent(null);
			}
		}
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PostMapping("/updatestudentdetails")
	public ResponseEntity<ResponseValue> updateStudent(@RequestBody ResponseValue responses) {
	    String link = "http://localhost:9091/updatestudent";
	    String link1 = "http://localhost:9090/updatecollege";
	    ResponseValue response = new ResponseValue();

	    College clg = webClient.post().uri(link1)
	            .bodyValue(responses.getCollege())
	            .retrieve()
	            .bodyToMono(College.class).block();

	    Student stud = webClient.post().uri(link)
	            .bodyValue(responses.getStudent())
	            .retrieve()
	            .bodyToMono(Student.class).block();
	    if( clg!=null && stud!=null) {
	    	response.setCollege(clg);
	    	response.setStudent(stud);
	    }else {
	    	response.setCollege(null);
	    	response.setStudent(null);
	    }

	    return new ResponseEntity<>(response,HttpStatus.OK);
	    
}
	@GetMapping("/deletestudentdetail")
	public ResponseEntity<String> delteStudent(@RequestParam("id") Integer studentId) {
	    String link = "http://localhost:9091/getstudent?id={id}";
	    String message = webClient.get().uri(link, studentId).retrieve().bodyToMono(String.class).block();
	    if(message!=null) {
	    	if(message.equalsIgnoreCase("Student Data deleted Successfully")) {
		    	return new ResponseEntity<>(message,HttpStatus.OK);
		    }else {
		    	return new ResponseEntity<>(message,HttpStatus.NOT_FOUND);
		    }
	    }else {
	    	return new ResponseEntity<>(message,HttpStatus.NO_CONTENT);
	    }
	    
}
}
	


