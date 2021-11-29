package com.cyclingapp.cyclingservice.cyclingservice.converter;

import org.springframework.core.convert.converter.Converter;

import com.cyclingapp.cyclingservice.cyclingservice.dto.CountryDTO;
import com.cyclingapp.cyclingservice.cyclingservice.repository.model.Country;

public class CountryDTOConverter implements Converter<Country, CountryDTO>{

	@Override
	public CountryDTO convert(Country source) {
		CountryDTO target = new CountryDTO();
		target.setId(source.getId());
		target.setCountryCode(source.getCountryCode());
		target.setCountryName(source.getCountryName());
		return target;
	}

}
