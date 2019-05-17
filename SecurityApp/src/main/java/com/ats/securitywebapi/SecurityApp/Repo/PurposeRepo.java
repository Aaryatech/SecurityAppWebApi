package com.ats.securitywebapi.SecurityApp.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ats.securitywebapi.SecurityApp.model.Purpose;

public interface PurposeRepo extends JpaRepository<Purpose, Integer>{

	List<Purpose> findByDelStatusOrderByPurposeIdDesc(int i);

	Purpose findByPurposeIdAndDelStatusOrderByPurposeIdDesc(int purposeId, int i);

	@Transactional
	@Modifying
	@Query("update Purpose set del_status=0  WHERE purpose_id=:purposeId")
	int deletePurpose(@Param("purposeId") int purposeId);

}
