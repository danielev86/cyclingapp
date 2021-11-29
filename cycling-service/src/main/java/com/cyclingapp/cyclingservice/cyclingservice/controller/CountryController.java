package com.cyclingapp.cyclingservice.cyclingservice.controller;

import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cyclingapp.cyclingservice.cyclingservice.dto.CountryDTO;
import com.cyclingapp.cyclingservice.cyclingservice.service.CountryService;

@Controller
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

}
