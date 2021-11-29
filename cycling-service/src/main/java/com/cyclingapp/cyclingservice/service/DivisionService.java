package com.cyclingapp.cyclingservice.service;

import static org.springframework.core.convert.TypeDescriptor.collection;
import static org.springframework.core.convert.TypeDescriptor.valueOf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import com.cyclingapp.cyclingservice.dto.DivisionDTO;
import com.cyclingapp.cyclingservice.repository.IDivisionRepository;
import com.cyclingapp.cyclingservice.repository.model.Division;

@Service
public class DivisionService {
	
	@Autowired
	private ConversionService converter;
	
	@Autowired
	private IDivisionRepository divisionRepository;
	
	@SuppressWarnings("unchecked")
	public List<DivisionDTO> getAllDivision() {
		List<Division> divisionList = divisionRepository.findAllDivisionOrderByPos();
		List<DivisionDTO> divisions = (List<DivisionDTO>)  converter.convert(divisionList
				, collection(List.class, valueOf(Division.class))
				, collection(List.class, valueOf(DivisionDTO.class)));
		return divisions;
	}

}
