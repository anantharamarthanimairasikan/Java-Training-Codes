package com.prodapt.sbresttemplate.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.sbresttemplate.entities.College;
import com.prodapt.sbresttemplate.exception.CollegeNotFoundException;
import com.prodapt.sbresttemplate.repository.CollegeRepository;
@Service
public class CollegeServiceImpl implements CollegeService{
	@Autowired
	CollegeRepository clgrep;

	@Override
	public College addCollege(College college) {
		return clgrep.save(college);
	}

	@Override
	public College getCollege(Integer id) throws CollegeNotFoundException {
		Optional<College> college =clgrep.findById(id);
		if(college.isPresent()) {
			return college.get();
		}else {
			throw new CollegeNotFoundException("College Not Found");
		}
	}

	@Override
	public College updateCollege(College college) throws CollegeNotFoundException {
		Optional<College> college1 =clgrep.findById(college.getId());
		if(college1.isPresent()) {
			return clgrep.save(college);
		}else {
			throw new CollegeNotFoundException("College Not Found");
		}
	}

	@Override
	public String deleteCollege(Integer id) throws CollegeNotFoundException {
		Optional<College> college1 =clgrep.findById(id);
		if(college1.isPresent()) {
			clgrep.deleteById(id);
			return "College Deleted Successfully";
		}else {
			throw new CollegeNotFoundException("College Not Found");
		}
	}
}

