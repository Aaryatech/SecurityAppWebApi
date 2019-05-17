package com.ats.securitywebapi.SecurityApp.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ats.securitywebapi.SecurityApp.model.ProductionAccess;

public interface ProductionAccessRepo extends JpaRepository<ProductionAccess, Integer>{

	List<ProductionAccess> findByDelStatusOrderByProductionAccessIdDesc(int i);

	ProductionAccess findByProductionAccessIdAndDelStatusOrderByProductionAccessIdDesc(int productionAccessId, int i);

	@Transactional
	@Modifying
	@Query("update ProductionAccess set del_status=0  WHERE production_access_id=:productionAccessId")
	int deleteProduction(@Param("productionAccessId") int productionAccessId);

	
}
