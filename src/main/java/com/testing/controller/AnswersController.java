package com.testing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.testing.bean.Answers;
import com.testing.service.AnswersService;

@RestController
@CrossOrigin("http://localhost:3000")
public class AnswersController {

	@Autowired	
	private AnswersService answersService;	
	

	
	@PostMapping("/addAnswerDetails")
	public String addAdmin(@RequestBody Answers answers) {
		
  		return answersService.addAnswers(answers);
		
	}
	
//	@PostMapping("/addAnswerDetails")
//	public String addAdmin(@RequestBody Answers answers) {
//		
//		return answersService.addAnswers(answers);
//		
//	}
	
	@GetMapping("/getAllAnswerDetails")
	public List<Answers> getAllAnswers() {
		
		return answersService.findAll();
	}
	
//	
//	@GetMapping("/getAllAnswerIds")
//	public List<Integer> getAllAnswerIds() {
//		
//		return answersService.getAllAnswerIds();
//	}
//	
//
//	@GetMapping("/findAnsbyAnswerId/{answerId}")
//	public Optional<Answers> findAnsbyAnswerId(@PathVariable("answerId") int answerId ) {
//				
//		return answersService.findAnsbyAnswerId(answerId);
//		
//	}

//	@GetMapping("/questions/{questio}/answer")
//	public String getAnswerByQuestionId(@PathVariable int questio ) {
//	return answersService.findAnswerByQuestionId(questio);
//	    }
	
}
