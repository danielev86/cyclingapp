package com.cyclingapp.cyclingservice.cyclingservice.repository.model;

import java.io.Serializable;

public class Country implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String countryCode;

	private String countryName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
