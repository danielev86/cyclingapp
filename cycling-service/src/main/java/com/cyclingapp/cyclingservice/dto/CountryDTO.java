package com.cyclingapp.cyclingservice.dto;

import java.io.Serializable;
import java.util.Objects;

public class CountryDTO implements Serializable {

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

	@Override
	public int hashCode() {
		return Objects.hash(countryCode, countryName, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryDTO other = (CountryDTO) obj;
		return Objects.equals(countryCode, other.countryCode) && Objects.equals(countryName, other.countryName)
				&& Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", countryCode=" + countryCode + ", countryName=" + countryName + "]";
	}

}
