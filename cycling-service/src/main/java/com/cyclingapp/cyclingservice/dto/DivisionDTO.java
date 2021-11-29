package com.cyclingapp.cyclingservice.dto;

import java.io.Serializable;
import java.util.Objects;

public class DivisionDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String divisionName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(divisionName, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DivisionDTO other = (DivisionDTO) obj;
		return Objects.equals(divisionName, other.divisionName) && Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "DivisionDTO [id=" + id + ", divisionName=" + divisionName + "]";
	}

}
