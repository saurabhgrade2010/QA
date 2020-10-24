package com.demo.qa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.qa.dao.TopicDao;
import com.demo.qa.entities.Topic;

@Service
public class TopicServiceImpl  implements TopicService{

	@Autowired
	TopicDao topicDao;
	
	
	@Override
	public ResponseEntity<?> saveTopicData(Topic topicData) {
		Topic topic = topicDao.save(topicData);
		return new ResponseEntity<>(topic,HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<?> deleteTopicData(Long topicId) {
	
		Topic topic = topicDao.findByTopicId(topicId);
		
		if(topic == null)
		{
			return new ResponseEntity<>("Data Not Found",HttpStatus.NOT_FOUND);
		}
		
		//Long n= topicDao.deleteByTopicId(topicId);
		
		topicDao.deleteById(topicId);
		return new ResponseEntity<>("Record Delete",HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> updateTopicData(Topic topicData) {
		
		Topic topic = topicDao.findByTopicId(topicData.getTopicId());
		
		if(topic == null){
			return new ResponseEntity<>("Data Not Found",HttpStatus.NOT_FOUND);
		}
		
		topic.setQuestion(topicData.getQuestion());
		topic.setTopicName(topicData.getTopicName());
		topic.setSubTopicId(topicData.getSubTopicId());
		
		topicData = topicDao.save(topic);
		
		return new ResponseEntity<>(topicData,HttpStatus.OK);
	}

}
