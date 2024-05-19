package com.prodapt.sbrestudenttemplate2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.sbrestudenttemplate2.entitiy.Student;
import com.prodapt.sbrestudenttemplate2.exception.StudentNotFoundException;
import com.prodapt.sbrestudenttemplate2.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository rep;

	@Override
	public Student addStudent(Student student) {
		return rep.save(student);
	}

	@Override
	public Student getStudent(Integer id) throws StudentNotFoundException {
		Optional<Student> student =rep.findById(id);
		if(student.isPresent()) {
			return student.get();
		}else {
			throw new StudentNotFoundException("Student Not Found");
		}
	}

	@Override
	public Student updateStudent(Student student) throws StudentNotFoundException {
		Optional<Student> student1 =rep.findById(student.getStudId());
		if(student1.isPresent()) {
			return rep.save(student);
		}else {
			throw new StudentNotFoundException("Student Not Found");
		}
	}

	@Override
	public String deleteStudent(Integer id) throws StudentNotFoundException {
		Optional<Student> student =rep.findById(id);
		if(student.isPresent()) {
			rep.deleteById(id);
			return "Student Data deleted Successfully";
		}else {
			throw new StudentNotFoundException("Student Not Found");
		}
	}

}
