package com.cyclingapp.cyclingservice.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cyclingapp.cyclingservice.repository.model.Cyclist;

@Repository
public interface ICyclistRepository extends PagingAndSortingRepository<Cyclist, Long> {
	
	public List<Cyclist> findByFirstName(String firstName);
	
	public List<Cyclist> findByLastName(String lastName);
	
	public List<Cyclist> findByFirstNameAndLastName(String firstName, String lastName);

}
