package com.prodapt.sbrestudenttemplate2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.sbrestudenttemplate2.entitiy.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	

}
