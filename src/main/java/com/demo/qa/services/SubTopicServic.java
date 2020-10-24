package com.demo.qa.services;

import org.springframework.http.ResponseEntity;

import com.demo.qa.entities.SubTopic;

public interface SubTopicServic {

	
	ResponseEntity<?> saveSubTopicData(SubTopic subTopicData);
	ResponseEntity<?> updateSubTopic(SubTopic subTopicData);
	
	ResponseEntity<?> deleteSubTopic(Long subTopicId);
	
	
	
}
