package com.demo.qa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.qa.entities.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question,Long>{
	
	Question findByQuesionId(Long questionId);
	

}
