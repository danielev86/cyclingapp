package com.cyclingapp.cyclingservice.cyclingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cyclingapp.cyclingservice.cyclingservice.repository.model.Division;

public interface IDivisionRepository extends JpaRepository<Division, Long>{
	
	@Query("SELECT division FROM Division division ORDER BY division.position ASC")
	public List<Division> findAllDivisionOrderByPos();

}
