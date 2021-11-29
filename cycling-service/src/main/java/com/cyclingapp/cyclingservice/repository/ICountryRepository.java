package com.cyclingapp.cyclingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyclingapp.cyclingservice.repository.model.Country;

public interface ICountryRepository extends JpaRepository<Country, Long>{

}
