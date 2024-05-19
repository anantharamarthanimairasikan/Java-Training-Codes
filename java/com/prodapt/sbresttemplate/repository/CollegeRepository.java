package com.prodapt.sbresttemplate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.sbresttemplate.entities.College;
@Repository
public interface CollegeRepository extends CrudRepository<College, Integer> {

}
