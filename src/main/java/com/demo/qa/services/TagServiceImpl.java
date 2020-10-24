package com.demo.qa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.qa.dao.TagDao;
import com.demo.qa.entities.Tags;

@Service
public class TagServiceImpl implements TagService{

	@Autowired
	TagDao tagDao;
	
	@Override
	public List<Tags> findByQuestionId(Long questionId) {
		
		return tagDao.findByQuestionId(questionId);
	}

	@Override
	public ResponseEntity<?> saveTagData(Tags tagData) {
		
		Tags newTagData = tagDao.save(tagData);
		
		return new ResponseEntity<>(newTagData,HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<?> deleteTagData(Long tagId) {
		
		boolean isExist = tagDao.existsById(tagId);
		
		if(isExist == false)
		{
			return new ResponseEntity<>("Data Not Found",HttpStatus.NOT_FOUND);
		}
		
		tagDao.deleteById(tagId);
		
		return new ResponseEntity<>("Record Deleted",HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> updateTagData(Tags tagData) {
		
		Tags newTagData = tagDao.findByTagId(tagData.getTagId());
		
		if(newTagData == null)
		{
			return new ResponseEntity<>("Data Not Found",HttpStatus.NOT_FOUND);
		}
		
		newTagData.setQuestion(tagData.getQuestion());
		newTagData.setTagName(tagData.getTagName());
		
		tagData = tagDao.save(newTagData);
		
		return new ResponseEntity<>(tagData,HttpStatus.OK);
	}

}
