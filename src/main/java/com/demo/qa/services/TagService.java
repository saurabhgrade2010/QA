package com.demo.qa.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.demo.qa.entities.Tags;

public interface TagService {
	
	List<Tags> findByQuestionId(Long questionId);
	
	ResponseEntity<?> saveTagData(Tags tagData);
	ResponseEntity<?> deleteTagData(Long tagId);
	ResponseEntity<?> updateTagData(Tags tagData);
	
}
