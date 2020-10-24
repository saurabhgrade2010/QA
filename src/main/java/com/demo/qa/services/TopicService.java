package com.demo.qa.services;

import org.springframework.http.ResponseEntity;

import com.demo.qa.entities.Topic;

public interface TopicService {
	
	
	ResponseEntity<?> saveTopicData(Topic topicData);
	ResponseEntity<?> deleteTopicData(Long topicId);
	ResponseEntity<?> updateTopicData(Topic topicData);

}
