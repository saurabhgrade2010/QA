package com.demo.qa.services;

import org.springframework.http.ResponseEntity;

import com.demo.qa.entities.Answer_likes;

public interface AnswerLikeService {
	
	ResponseEntity<?> saveAnswerLikeData(Answer_likes answerData);

}
