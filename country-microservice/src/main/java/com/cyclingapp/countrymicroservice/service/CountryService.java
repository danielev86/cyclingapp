package com.cyclingapp.countrymicroservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.stereotype.Service;

import com.cyclingapp.countrymicroservice.dto.CountryDTO;
import com.cyclingapp.countrymicroservice.repository.model.Country;

@Service
public class CountryService {
	
	@Autowired
	private ConversionService converter;

	@SuppressWarnings("unchecked")
	public List<CountryDTO> getAllCountries(){
		List<CountryDTO> countries = (List<CountryDTO>) converter
				.convert(getMockCountries()
						, TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(Country.class))
						, TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(CountryDTO.class)));
		return countries;
	}
	
	public CountryDTO getCountryById(Long id) {
		List<Country> countries = getMockCountries();
		Country country = countries
				.stream()
				.filter(x -> x.getId() == id)
				.findFirst().get();
		CountryDTO countryDTO = converter.convert(country, CountryDTO.class);
		return countryDTO;
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
