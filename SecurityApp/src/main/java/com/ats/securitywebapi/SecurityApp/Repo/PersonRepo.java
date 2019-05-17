package com.ats.securitywebapi.SecurityApp.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.ats.securitywebapi.SecurityApp.model.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{



	@Transactional
	@Modifying
	@Query("update Person set del_status=0  WHERE person_id=:id")
	int deletePerson(int id);

	Person findByIdAndDelStatusOrderByIdDesc(int id, int i);

	List<Person> findByDelStatusOrderByIdDesc(int i);

	
}
