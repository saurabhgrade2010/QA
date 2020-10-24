package com.demo.qa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.qa.dao.CommentDao;
import com.demo.qa.entities.Comments;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentDao cmntDao;
	
	@Override
	public ResponseEntity<?> saveComments(Comments commentData) {
		
		Comments c = cmntDao.save(commentData);
		return new ResponseEntity<>(c,HttpStatus.CREATED);
	}

}
