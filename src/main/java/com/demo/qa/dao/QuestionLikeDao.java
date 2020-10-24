package com.demo.qa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.qa.entities.Question_likes;

@Repository
public interface QuestionLikeDao extends JpaRepository<Question_likes,Long>{
	
	List<Question_likes> findByQuestionId(Long questionId);

}
