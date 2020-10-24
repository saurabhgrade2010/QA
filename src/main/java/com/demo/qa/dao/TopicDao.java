package com.demo.qa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.qa.entities.Topic;

@Repository
public interface TopicDao extends JpaRepository<Topic,Long>{
	
	Topic findByTopicId(Long topicId);
	
	Long deleteByTopicId(Long topicId);

}
