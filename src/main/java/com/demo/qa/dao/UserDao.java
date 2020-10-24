package com.demo.qa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.qa.entities.Userr;

@Repository
public interface UserDao extends JpaRepository<Userr,Long>{
		
	Userr findByUserId(Long userId);

}
