package com.demo.qa.services;

import org.springframework.http.ResponseEntity;

import com.demo.qa.Dto.ResponseDtoOne;
import com.demo.qa.entities.Question;

public interface QuestionService {
	
	ResponseEntity<?> setQuestions(Question questionData);
	
	ResponseDtoOne getQuestionAnswerData(Long questionId);

}
