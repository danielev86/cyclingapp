package com.cyclingapp.cyclingservice.service;

import static org.springframework.core.convert.TypeDescriptor.collection;
import static org.springframework.core.convert.TypeDescriptor.valueOf;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import com.cyclingapp.cyclingservice.dto.CountryDTO;
import com.cyclingapp.cyclingservice.exceptions.NotFoundException;
import com.cyclingapp.cyclingservice.repository.ICountryRepository;
import com.cyclingapp.cyclingservice.repository.model.Country;

@Service
public class CountryService {
	
	private static final Logger logger = LoggerFactory.getLogger(CountryService.class);
	
	@Autowired
	private ConversionService converter;
	
	@Autowired
	private ICountryRepository countryRepository;
	
	@SuppressWarnings("unchecked")
	public List<CountryDTO> getAllCountries(){
		logger.info("Retrieve all country");
		List<Country> countryList = countryRepository.findAll();
		List<CountryDTO> countries = (List<CountryDTO>) converter
				.convert(countryList
						, collection(List.class, valueOf(Country.class))
						, collection(List.class, valueOf(CountryDTO.class)));
		logger.debug("Retrieved countries: {}", countries);
		return countries;
	}
	
	public CountryDTO getCountryByName(String countryName) throws NotFoundException{
		Country country = countryRepository.findCountryByName(countryName);
		CountryDTO countryDTO = null;
		if (country != null) {
			countryDTO = converter.convert(country, CountryDTO.class);
		}else {
			logger.error("Error CountryByName. Name: " + countryName + " not found!!!");
			throw new NotFoundException("Country data not present!");
		}
		return countryDTO;
	}

}
