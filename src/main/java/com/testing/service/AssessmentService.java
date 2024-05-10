package com.testing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testing.bean.Assessment;
import com.testing.repo.AssessmentRepo;

@Service
public class AssessmentService {

	@Autowired
	private AssessmentRepo assessmentRepo;
	
	
	public String addAssessment(Assessment assessment) {
		try {			
			return assessmentRepo.insertAssessment(assessment);
			
			
		}catch(Exception e) {
			return "Failed To  Add Assessment";
			
		}	
		
	}


	public List<Assessment> findAll() {
		
		return assessmentRepo.getAllAssessment();
		}
	


}
