package com.testing.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.testing.bean.Answers;

import jakarta.persistence.EntityManager;


@Repository
@Transactional
public class AnswersRepo  {

	
	@Autowired
	private EntityManager manager;	
	
	@SuppressWarnings("unchecked")
	public List<Answers> getAllAnswer(){
		String getAllQuery = "select a from Answers a";
		
		jakarta.persistence.Query  quer =  manager.createQuery(getAllQuery);
		
		return quer.getResultList();
	}
	
	
	public String insertAnswer(Answers answer) {
		try {
			System.out.println(answer);
	    manager.persist(answer);
	    
	    return "Success";
		}
		catch(Exception e)
		{
	e.printStackTrace();
		return "Failed to Insert";	
		}
		}



} 