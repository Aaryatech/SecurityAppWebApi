package com.ats.securitywebapi.SecurityApp.Repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ats.securitywebapi.SecurityApp.model.GatePassVisitor;

public interface GatePassVisitorRepository extends JpaRepository<GatePassVisitor, Integer>{

	@Transactional
	@Modifying
	@Query("update GatePassVisitor set del_status=0  WHERE gatepass_visitor_id=:gatepassVisitorId")
	int deleteGatePassVisitor(@Param("gatepassVisitorId") int gatepassVisitorId);

	GatePassVisitor findByGatepassVisitorIdAndDelStatusOrderByGatepassVisitorIdDesc(int gatepassVisitorId, int i);

	List<GatePassVisitor> findByDelStatusOrderByGatepassVisitorIdDesc(int i);

}
