package com.demo.qa.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import com.demo.qa.entities.Company;

public interface CompanyService {
	
	ResponseEntity<?> savecompanyData(Company company);
	List<Company> getAllCompany();
	ResponseEntity<?> updateCompany(Company company);
	
	ResponseEntity<?> deleteCopmany(Long companyId);
	
}
