package com.demo.qa.services;

import org.springframework.http.ResponseEntity;

import com.demo.qa.entities.Question;
import com.demo.qa.entities.Userr;



public interface UserService {
	
	ResponseEntity<?> getUserData(Long userId);
	
	ResponseEntity<?> setUserData(Userr userData);
	

}
