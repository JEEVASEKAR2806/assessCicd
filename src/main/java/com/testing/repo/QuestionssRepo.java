package com.testing.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.testing.bean.Questionss;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
@Transactional
public class QuestionssRepo  {

	@Autowired
	private EntityManager manager;

	@SuppressWarnings("unchecked")
	public List<Questionss> findAll() {
	
		String getAllQuery="select a from Questionss a";		
		Query query=manager.createQuery(getAllQuery);
		
		return query.getResultList();
	}
	
	
	public String insertQuestion(Questionss ques) {
		try {	
			System.out.println(ques);
	    manager.persist(ques);	    
	    return "Success";
		}
		catch(Exception e)
		{
		e.printStackTrace();
		return "Failed to Insert";	
		}
		}
	
} 
