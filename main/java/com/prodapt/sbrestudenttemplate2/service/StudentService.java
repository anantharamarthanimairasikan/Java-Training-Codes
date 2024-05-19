package com.prodapt.sbrestudenttemplate2.service;

import com.prodapt.sbrestudenttemplate2.entitiy.Student;
import com.prodapt.sbrestudenttemplate2.exception.StudentNotFoundException;

public interface StudentService {

	Student addStudent(Student student);

	Student getStudent(Integer id) throws StudentNotFoundException;

	Student updateStudent(Student student) throws StudentNotFoundException;

	String deleteStudent(Integer id) throws StudentNotFoundException;

}
