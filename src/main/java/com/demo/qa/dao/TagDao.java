package com.demo.qa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.qa.entities.Tags;

@Repository
public interface TagDao extends JpaRepository<Tags,Long>{
	
	List<Tags> findByQuestionId(Long questionId);
	
	Tags findByTagId(Long tagId);
	

}
