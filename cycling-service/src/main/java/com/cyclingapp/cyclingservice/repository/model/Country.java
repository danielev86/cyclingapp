package com.cyclingapp.cyclingservice.repository.model;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "country_code", nullable = false)
	private String countryCode;

	@Column(name = "country_name", nullable = false)
	private String countryName;

	@OneToMany(fetch = LAZY, cascade = ALL, mappedBy = "country")
	private List<Cyclist> cyclists = new ArrayList<Cyclist>();

	@OneToMany(fetch = LAZY, cascade = ALL, mappedBy = "country")
	private List<Team> teams = new ArrayList<Team>();

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

	public List<Cyclist> getCyclists() {
		return cyclists;
	}

	public void setCyclists(List<Cyclist> cyclists) {
		this.cyclists = cyclists;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", countryCode=" + countryCode + ", countryName=" + countryName + ", cyclists="
				+ cyclists + ", teams=" + teams + "]";
	}

}
