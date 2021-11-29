package com.cyclingapp.cyclingservice.cyclingservice.controller;

import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cyclingapp.cyclingservice.cyclingservice.dto.DivisionDTO;
import com.cyclingapp.cyclingservice.cyclingservice.service.DivisionService;

@Controller
@RequestMapping(value = "/api/division")
@CrossOrigin(origins = "http://localhost:4200")
public class DivisionController {
	
	@Autowired
	private DivisionService divisionService;
	
	@GetMapping(value = "/")
	public ResponseEntity<List<DivisionDTO>> getAllDivision(){
		List<DivisionDTO> divisions = divisionService.getAllDivision();
		return new ResponseEntity<List<DivisionDTO>>(divisions, OK);
	}

}
