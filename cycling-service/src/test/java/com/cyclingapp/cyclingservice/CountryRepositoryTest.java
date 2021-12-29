package com.cyclingapp.cyclingservice;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.cyclingapp.cyclingservice.repository.ICountryRepository;
import com.cyclingapp.cyclingservice.repository.model.Country;

@DataJpaTest
public class CountryRepositoryTest {
	
	private static final Logger logger = LoggerFactory.getLogger(CountryRepositoryTest.class);
	
	@Autowired
	private ICountryRepository countryRepository;
	
	@Test
	public void findCountryByName() {
		Country country = countryRepository.findCountryByName("Italy");
		if (country != null) {
			logger.info("Country: " + country.toString());
		}
	}

}
