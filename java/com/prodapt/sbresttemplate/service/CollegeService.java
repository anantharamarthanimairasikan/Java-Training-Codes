package com.prodapt.sbresttemplate.service;

import com.prodapt.sbresttemplate.entities.College;
import com.prodapt.sbresttemplate.exception.CollegeNotFoundException;

public interface CollegeService {
	
	College addCollege(College college);
	
	College getCollege(Integer id) throws CollegeNotFoundException;
	
	College updateCollege(College college) throws CollegeNotFoundException;
	
	String deleteCollege(Integer id)throws CollegeNotFoundException;
}
