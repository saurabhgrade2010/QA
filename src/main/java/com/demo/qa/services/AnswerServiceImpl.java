package com.demo.qa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.qa.dao.AnswerDao;
import com.demo.qa.entities.Answer;

@Service
public class AnswerServiceImpl implements AnswerService{

	@Autowired
	AnswerDao answerDao;
	
	@Override
	public ResponseEntity<?> saveAnswer(Answer answerData) {
		// TODO Auto-generated method stub
		
		Answer listAnswer = answerDao.save(answerData);
		
		return new ResponseEntity<>(listAnswer,HttpStatus.CREATED);
		
	}

	@Override
	public List<Answer> getAnswerByQuestionId(Long questionId) {
		
		List<Answer> listAnswer = answerDao.findByQuestionId(questionId);
		
		return listAnswer;
	}

}
