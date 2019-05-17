package com.ats.securitywebapi.SecurityApp.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ats.securitywebapi.SecurityApp.model.EmployeeAccesories;

public interface EmployeeAccesoriesRepo extends JpaRepository<EmployeeAccesories, Integer>{

	EmployeeAccesories findByEmpAccsoriesIdAndDelStatusOrderByEmpAccsoriesIdDesc(int empAccsoriesId, int i);

	

	@Transactional
	@Modifying
	@Query("update EmployeeAccesories set del_status=0  WHERE emp_accsories_id=:empAccsoriesId")
	int deleteEmpAcces(@Param("empAccsoriesId") int empAccsoriesId);
	
	List<EmployeeAccesories> findByDelStatusOrderByEmpAccsoriesIdDesc(int i);

}
