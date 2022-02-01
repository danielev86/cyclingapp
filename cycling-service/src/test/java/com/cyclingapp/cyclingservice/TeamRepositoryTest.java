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

import com.cyclingapp.cyclingservice.repository.ITeamRepository;
import com.cyclingapp.cyclingservice.repository.model.Team;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ContextConfiguration(classes = {CyclingServiceApplication.class})
public class TeamRepositoryTest {
	
	@Autowired
	private ITeamRepository teamRepository;
	
	@Test
	@Transactional
	public void findAllTeams() {
		List<Team> teams = (List<Team>) teamRepository.findAll();
		assertEquals(true, teams.size() > 0);
	}
	
	@Test
	@Transactional
	public void findTeamById() {
		Team team = teamRepository.findById(1L).get();
		assertEquals("Movistar Team", team.getTeamName());
		
	}

}
