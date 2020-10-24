package com.demo.qa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.qa.dao.QuestionLikeDao;
import com.demo.qa.entities.Question_likes;

@Service
public class QuestuionLikeImpl implements QuestionLike {

	@Autowired
	QuestionLikeDao questionLikeDao;
	
	@Override
	public ResponseEntity<?> saveQuestionLike(Question_likes qsnData) {
		
		Question_likes qsnLike = questionLikeDao.save(qsnData);
		
		return new ResponseEntity<>(qsnLike,HttpStatus.CREATED);
	}

	@Override
	public List<Question_likes> getQuestionLikeByQuestionId(Long questionId) {
		// TODO Auto-generated method stub
		
		return questionLikeDao.findByQuestionId(questionId);
		
	}

}
