package com.cyclingapp.cyclingservice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import com.cyclingapp.cyclingservice.repository.ICountryRepository;
import com.cyclingapp.cyclingservice.repository.model.Country;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ContextConfiguration(classes = {CyclingServiceApplication.class})
public class CountryRepositoryTest {
	
	private static final Logger logger = LoggerFactory.getLogger(CountryRepositoryTest.class);
	
	@Autowired
	private ICountryRepository countryRepository;
	
	@Test
	@Transactional
	public void findCountryByName() {
		Country c = countryRepository.findCountryByName("Italy");
		if (c != null && c.getCyclists() != null && !(c.getCyclists().isEmpty())) {
			logger.info("Country: " + c.toString());
		}
	}

}
