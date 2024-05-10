package com.testing.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.testing.bean.Assessment;

import jakarta.persistence.EntityManager;


@Repository
@Transactional
public class AssessmentRepo  {

	
	@Autowired
	private EntityManager manager;	
	
	@SuppressWarnings("unchecked")
	public List<Assessment> getAllAssessment(){
		String getAllQuery = "select a from Assessment a";
		
		jakarta.persistence.Query  quer =  manager.createQuery(getAllQuery);
		
		return quer.getResultList();
	}
	
	public String insertAssessment(Assessment assess) {
		try {	
			System.out.println(assess);
	    manager.persist(assess);	    
	    return "Success";
		}
		catch(Exception e)
		{
		e.printStackTrace();
		return "Failed to Insert";	
		}
		}
	
}

