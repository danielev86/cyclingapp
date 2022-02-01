package com.cyclingapp.cyclingservice.repository.model;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String teamName;

	@Column
	private String generalManager;

	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "country_id")
	private Country country;

	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "id_division")
	private Division division;

	@OneToMany(fetch = LAZY, mappedBy = "team")
	private List<Cyclist> cyclists = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getGeneralManager() {
		return generalManager;
	}

	public void setGeneralManager(String generalManager) {
		this.generalManager = generalManager;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

	public List<Cyclist> getCyclists() {
		return cyclists;
	}

	public void setCyclists(List<Cyclist> cyclists) {
		this.cyclists = cyclists;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", teamName=" + teamName + ", generalManager=" + generalManager + ", country="
				+ country + ", division=" + division + ", cyclists=" + cyclists + "]";
	}

}
