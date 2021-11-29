package com.cyclingapp.cyclingservice.cyclingservice.converter;

import org.springframework.core.convert.converter.Converter;

import com.cyclingapp.cyclingservice.cyclingservice.dto.DivisionDTO;
import com.cyclingapp.cyclingservice.cyclingservice.repository.model.Division;

public class DivisionDTOConverter implements Converter<Division, DivisionDTO>{

	@Override
	public DivisionDTO convert(Division source) {
		DivisionDTO target = new DivisionDTO();
		target.setId(source.getId());
		target.setDivisionName(source.getDivisionName());
		return target;
	}

}
