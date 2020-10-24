package com.demo.qa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.qa.entities.SubTopic;

@Repository
public interface SubTopicDao extends JpaRepository<SubTopic,Long>{
	
	SubTopic findBySubTopicId(Long subTopicId);

}
