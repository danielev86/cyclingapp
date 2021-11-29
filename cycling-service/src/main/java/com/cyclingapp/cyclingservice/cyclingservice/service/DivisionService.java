package com.cyclingapp.cyclingservice.cyclingservice.service;

import static org.springframework.core.convert.TypeDescriptor.collection;
import static org.springframework.core.convert.TypeDescriptor.valueOf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import com.cyclingapp.cyclingservice.cyclingservice.dto.DivisionDTO;
import com.cyclingapp.cyclingservice.cyclingservice.repository.model.Division;

@Service
public class DivisionService {
	
	@Autowired
	private ConversionService converter;
	
	public List<DivisionDTO> getAllDivision() {
		List<DivisionDTO> divisions = (List<DivisionDTO>)  converter.convert(buildMockDivisions()
				, collection(List.class, valueOf(Division.class))
				, collection(List.class, valueOf(DivisionDTO.class)));
		return divisions;
	}
	
	private List<Division> buildMockDivisions(){
		List<Division> divisions = new ArrayList<Division>();
		divisions.add(buildDivision(1L, "World Tour"));
		divisions.add(buildDivision(2L, "Professional"));
		divisions.add(buildDivision(3L, "Continental"));
		return divisions;
	}
	
	private Division buildDivision(Long id, String divisionName) {
		Division division = new Division();
		division.setId(id);
		division.setDivisionName(divisionName);
		return division;
	}

}
