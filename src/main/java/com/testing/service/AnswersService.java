package com.testing.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing.bean.Answers;
import com.testing.repo.AnswersRepo;

@Service
public class AnswersService {


	@Autowired
	private AnswersRepo answersRepo;	
	
	public List<Answers> findAll() {
		
	return answersRepo.getAllAnswer();
	}
	
	
	
	public String addAnswers(Answers answers) {
				
			return answersRepo.insertAnswer(answers);
			
		
	}
	
//	public String addAnswers(Answers answers) {
//		try {			
//			answersRepo.save(answers);
//			return "Answers Added Successfully";
//			
//		}catch(Exception e) {
//			return "Failed To  Add Answers";
//			
//		}	
//		
//	}
//
//
//	public List<Answers> getAllAnswers() {		
//		
//	return answersRepo.findAll() ;
//	}
//
//
//	public Optional<Answers> findAnsbyAnswerId(int answerId) {
//		
//		return answersRepo.findById(answerId);
//	}
//
//
//	public List<Integer> getAllAnswerIds() {
//		
//		return answersRepo.getAllAnswerId();
//	}
	
//	public String findAnswerByQuestionId(int questio) {
//        return answersRepo.findAnswerByQuestionId(questio);
//    }
	
}
