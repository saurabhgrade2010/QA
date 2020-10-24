package com.demo.qa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.qa.dao.UserDao;
import com.demo.qa.entities.Question;
import com.demo.qa.entities.Userr;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;
	
	@Override
	public ResponseEntity<?> getUserData(Long userId) {
		
		Userr ur = userDao.findByUserId(userId);
		
		if( ur == null)
		{
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(ur, HttpStatus.OK);
	}

	public ResponseEntity<?> setUserData(Userr userData) {
		
		Userr userr = userDao.save(userData);
		
		return new ResponseEntity<>(userr,HttpStatus.CREATED);
	}

	
	

}
