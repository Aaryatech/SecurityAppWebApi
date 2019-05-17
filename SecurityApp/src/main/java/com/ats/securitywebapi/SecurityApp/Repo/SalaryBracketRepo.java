package com.ats.securitywebapi.SecurityApp.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.ats.securitywebapi.SecurityApp.model.SalaryBracket;

public interface SalaryBracketRepo extends JpaRepository<SalaryBracket, Integer>{

	
	@Transactional
	@Modifying
	@Query("update SalaryBracket set del_status=0  WHERE salary_id=:salaryId")
	int deleteSalaryId(int salaryId);

	SalaryBracket findBySalaryIdAndDelStatusOrderBySalaryIdDesc(int salaryId, int i);

	List<SalaryBracket> findByDelStatusOrderBySalaryIdDesc(int i);
	
}
