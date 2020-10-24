package com.demo.qa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.qa.entities.Answer_likes;

@Repository
public interface AnswerLikeDao extends JpaRepository<Answer_likes,Long>{
	
	List<Answer_likes> findByAnswerId(Long answerId);

}
