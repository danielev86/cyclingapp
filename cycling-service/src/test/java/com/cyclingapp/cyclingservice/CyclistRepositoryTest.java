package com.cyclingapp.cyclingservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import com.cyclingapp.cyclingservice.repository.ICyclistRepository;
import com.cyclingapp.cyclingservice.repository.model.Cyclist;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ContextConfiguration(classes = {CyclingServiceApplication.class})
public class CyclistRepositoryTest {

	@Autowired
	private ICyclistRepository cyclistRepository;

	@Test
	@Transactional
	public void findAllCyclists() {
		List<Cyclist> cyclists = (List<Cyclist>) cyclistRepository.findAll();
		assertEquals(true, cyclists.size() > 0);
	}
	
	@Test
	@Transactional
	public void findCyclistById() {
		Cyclist cyclist = cyclistRepository.findById(431L).get();
		assertEquals("Vincenzo", cyclist.getFirstName());
		assertEquals("Nibali", cyclist.getLastName());
	}
	
	@Test
	@Transactional
	public void findCyclistByName() {
		List<Cyclist> cyclists = cyclistRepository.findByFirstName("Vincenzo");
		assertEquals(3, cyclists.size());
	}
	
	@Test
	@Transactional
	public void findCyclistByLastName() {
		List<Cyclist> cyclists = cyclistRepository.findByLastName("Froome");
		assertEquals(1, cyclists.size());
	}
	
	@Test
	@Transactional
	public void findCyclistByFirstNameAndLastName() {
		List<Cyclist> cyclists = cyclistRepository.findByFirstNameAndLastName("Vincenzo", "Nibali");
		assertEquals(1, cyclists.size());
		assertEquals("Vincenzo", cyclists.get(0).getFirstName());
		assertEquals("Nibali", cyclists.get(0).getLastName());
	}
	
}
