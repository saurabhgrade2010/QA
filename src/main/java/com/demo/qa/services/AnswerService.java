package com.demo.qa.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.demo.qa.entities.Answer;

public interface AnswerService {
	
	ResponseEntity<?> saveAnswer(Answer answerData);
	
	List<Answer> getAnswerByQuestionId(Long questionId);

}
