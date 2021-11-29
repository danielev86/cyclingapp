package com.cyclingapp.cyclingservice.cyclingservice.service;

import static org.springframework.core.convert.TypeDescriptor.collection;
import static org.springframework.core.convert.TypeDescriptor.valueOf;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import com.cyclingapp.cyclingservice.cyclingservice.dto.CountryDTO;
import com.cyclingapp.cyclingservice.cyclingservice.repository.model.Country;

@Service
public class CountryService {
	
	private static final Logger logger = LoggerFactory.getLogger(CountryService.class);
	
	@Autowired
	private ConversionService converter;
	
	@SuppressWarnings("unchecked")
	public List<CountryDTO> getAllCountries(){
		logger.info("Retrieve all country");
		List<CountryDTO> countries = (List<CountryDTO>) converter
				.convert(getMockCountries()
						, collection(List.class, valueOf(Country.class))
						, collection(List.class, valueOf(CountryDTO.class)));
		logger.debug("Retrieved countries: {}", countries);
		return countries;
	}
	
	private List<Country> getMockCountries(){
		List<Country> countries = new ArrayList<Country>();
		countries.add(buildCountry(1L, "ITA", "Italy"));
		countries.add(buildCountry(2L, "GER", "Germany"));
		countries.add(buildCountry(3L, "FRA", "France"));
		return countries;
	}
	
	private Country buildCountry(Long id, String countryCode, String countryName) {
		Country country = new Country();
		country.setId(id);
		country.setCountryCode(countryCode);
		country.setCountryName(countryName);
		return country;
	}

}
