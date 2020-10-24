package com.demo.qa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.qa.entities.Answer;

@Repository
public interface AnswerDao extends JpaRepository<Answer,Long> {

	List<Answer> findByQuestionId(Long questionId);
	
}
