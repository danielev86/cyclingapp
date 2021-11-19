package com.cyclingapp.countrymicroservice.controller;

import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyclingapp.countrymicroservice.dto.CountryDTO;
import com.cyclingapp.countrymicroservice.service.CountryService;

@RestController
@RequestMapping("/api")
public class CountryController {
	
	@Autowired
	private CountryService countryService;

	@GetMapping("/country/countries")
	public ResponseEntity<List<CountryDTO>> getAllCountries(){
		List<CountryDTO> countries = countryService.getAllCountries();
		return new ResponseEntity<List<CountryDTO>>(countries, OK);
	}
	
	@GetMapping("/country/{id}")
	public ResponseEntity<CountryDTO> getCountryById(@PathVariable("id") Long id){
		CountryDTO country = countryService.getCountryById(id);
		return new ResponseEntity<CountryDTO>(country, OK);
	}
	
}
