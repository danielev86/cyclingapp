package com.cyclingapp.countrymicroservice.converter;

import org.springframework.core.convert.converter.Converter;

import com.cyclingapp.countrymicroservice.dto.CountryDTO;
import com.cyclingapp.countrymicroservice.repository.model.Country;

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
