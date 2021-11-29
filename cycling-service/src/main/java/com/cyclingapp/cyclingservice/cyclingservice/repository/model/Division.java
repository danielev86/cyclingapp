package com.cyclingapp.cyclingservice.cyclingservice.repository.model;

import java.io.Serializable;

public class Division implements Serializable{
	
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

}
