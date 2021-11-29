package com.cyclingapp.cyclingservice.cyclingservice.service;

import static org.springframework.core.convert.TypeDescriptor.collection;
import static org.springframework.core.convert.TypeDescriptor.valueOf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import com.cyclingapp.cyclingservice.cyclingservice.dto.CountryDTO;
import com.cyclingapp.cyclingservice.cyclingservice.repository.model.Country;

@Service
public class CountryService {
	
	@Autowired
	private ConversionService converter;
	
	@SuppressWarnings("unchecked")
	public List<CountryDTO> getAllCountries(){
		List<CountryDTO> countries = (List<CountryDTO>) converter
				.convert(getMockCountries()
						, collection(List.class, valueOf(Country.class))
						, collection(List.class, valueOf(CountryDTO.class)));
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
