package com.demo.qa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.demo.qa.entities.Company;


@Repository
public interface CompanyDao extends JpaRepository<Company,Long>{
	
	@Query("select em from Company em where em.companyId in :ids")
	List<Company> findByCompanyId(@Param("ids") List<Long> companyId );
	
	List<Company> findAll();
	
	Company findByCompanyId(Long companyId);

}
