package com.ats.securitywebapi.SecurityApp.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ats.securitywebapi.SecurityApp.model.Gate;

public interface GateRepo extends JpaRepository<Gate, Integer>{

	Gate findByGateIdAndDelStatusOrderByGateIdDesc(int gateId, int i);


	@Transactional
	@Modifying
	@Query("update Gate set del_status=0  WHERE gate_id=:gateId")
	int deleteGate(@Param("gateId") int gateId);


	List<Gate> findByDelStatusOrderByGateIdDesc(int i);

}
