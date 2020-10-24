package com.demo.qa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.qa.dao.CompanyDao;
import com.demo.qa.entities.Company;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	CompanyDao companyDao;
	
	@Override
	public ResponseEntity<?> savecompanyData(Company company) {
		
		Company newcompany = companyDao.save(company);
		return new ResponseEntity<>(newcompany,HttpStatus.CREATED);
	}

	@Override
	public List<Company> getAllCompany() {
		
		List<Company> listCompany = companyDao.findAll();
		
		return listCompany;
	}

	@Override
	public ResponseEntity<?> updateCompany(Company company) {
	
		Company isDataExist = companyDao.findByCompanyId(company.getCompanyId());
		
		if(isDataExist == null)
		{
			return new ResponseEntity<>("Data Not Exist",HttpStatus.NOT_FOUND);
		}
		
		isDataExist.setCompanyName(company.getCompanyName());
		
		isDataExist = companyDao.save(isDataExist);
		return new ResponseEntity<>(isDataExist,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> deleteCopmany(Long companyId) {
		
		Company isDataExist = companyDao.findByCompanyId(companyId);
		
		if(isDataExist == null)
		{
			return new ResponseEntity<>("Data Not Found",HttpStatus.NOT_FOUND);
		}
		
		companyDao.deleteById(companyId);
		
		return new ResponseEntity<>("Record Delete",HttpStatus.OK);
	}
	
	
	

}
