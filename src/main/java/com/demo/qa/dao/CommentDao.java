package com.demo.qa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.qa.entities.Comments;

@Repository
public interface CommentDao extends JpaRepository<Comments,Long> {
	
	List<Comments> findByAnswerid(Long answerId);

}
