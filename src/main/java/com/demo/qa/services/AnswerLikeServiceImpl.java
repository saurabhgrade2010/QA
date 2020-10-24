package com.demo.qa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.qa.dao.AnswerLikeDao;
import com.demo.qa.entities.Answer_likes;

@Service
public class AnswerLikeServiceImpl implements AnswerLikeService{

	@Autowired
	AnswerLikeDao answerLikeDao;
	
	@Override
	public ResponseEntity<?> saveAnswerLikeData(Answer_likes answerData) {
		
		Answer_likes ans = answerLikeDao.save(answerData);
		
		return new ResponseEntity<>(ans,HttpStatus.CREATED);
	}

}
