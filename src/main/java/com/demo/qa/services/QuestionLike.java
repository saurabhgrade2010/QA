package com.demo.qa.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.demo.qa.entities.Question_likes;

public interface QuestionLike {
	
	ResponseEntity<?> saveQuestionLike(Question_likes questionLike);
	
	List<Question_likes> getQuestionLikeByQuestionId(Long questionId);

}
