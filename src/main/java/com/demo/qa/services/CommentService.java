package com.demo.qa.services;

import org.springframework.http.ResponseEntity;

import com.demo.qa.entities.Comments;

public interface CommentService {
	
	ResponseEntity<?> saveComments(Comments commentData);

}
