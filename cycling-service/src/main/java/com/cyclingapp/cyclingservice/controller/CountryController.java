package com.cyclingapp.cyclingservice.controller;

import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyclingapp.cyclingservice.dto.CountryDTO;
import com.cyclingapp.cyclingservice.exceptions.NotFoundException;
import com.cyclingapp.cyclingservice.service.CountryService;

@RestController
@RequestMapping("/api/country")
@CrossOrigin(origins = "http://localhost:4200")
public class CountryController {
	
	private static final Logger logger = LoggerFactory.getLogger(CountryController.class);
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping(value = "/")
	public ResponseEntity<List<CountryDTO>> getAllCountries(){
		logger.info("Call /api/country/ rest service");
		List<CountryDTO> countries = countryService.getAllCountries();
		return new ResponseEntity<List<CountryDTO>>(countries, OK);
	}
	
	@GetMapping("/{countryName}")
	public ResponseEntity<CountryDTO> getCountryByName(@PathVariable("countryName") String countryName) throws NotFoundException{
		CountryDTO country = countryService.getCountryByName(countryName);
		return new ResponseEntity<CountryDTO>(country, OK);
	}

}
