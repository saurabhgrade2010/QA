package com.demo.qa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.qa.dao.SubTopicDao;
import com.demo.qa.entities.SubTopic;

@Service
public class SubTopicServicImpl implements SubTopicServic{

	@Autowired
	SubTopicDao subTopicDao;
	
	@Override
	public ResponseEntity<?> saveSubTopicData(SubTopic subTopicData) {
		
		SubTopic newSubTopic = subTopicDao.save(subTopicData);
		return new ResponseEntity<>(newSubTopic,HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<?> updateSubTopic(SubTopic subTopicData) {
	
		SubTopic subTopicNew = subTopicDao.findBySubTopicId(subTopicData.getSubTopicId());
		
		if(subTopicNew == null)
		{
			return new ResponseEntity<>("Data Not Found", HttpStatus.NOT_FOUND);
		}
		
		subTopicNew.setSubTopicData(subTopicData.getSubTopicData());
		subTopicNew.setSubTopicName(subTopicData.getSubTopicName());
		
		subTopicData = subTopicDao.save(subTopicNew);
		return new ResponseEntity<>(subTopicNew,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> deleteSubTopic(Long subTopicId) {
		
		SubTopic subTopicNew = subTopicDao.findBySubTopicId(subTopicId);
		if(subTopicNew == null)
		{
			return new ResponseEntity<>("Data Not Found",HttpStatus.NOT_FOUND);
		}
		
		subTopicDao.deleteById(subTopicId);
		return new ResponseEntity<>("Record Deleted",HttpStatus.OK);
	}

}
