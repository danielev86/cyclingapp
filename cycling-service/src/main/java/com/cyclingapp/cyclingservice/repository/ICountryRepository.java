package com.cyclingapp.cyclingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cyclingapp.cyclingservice.repository.model.Country;

public interface ICountryRepository extends JpaRepository<Country, Long>{
	
	@Query("SELECT c FROM Country c WHERE c.countryName LIKE CONCAT('%',:countryName,'%')")
	public Country findCountryByName(@Param("countryName") String countryName);

}
