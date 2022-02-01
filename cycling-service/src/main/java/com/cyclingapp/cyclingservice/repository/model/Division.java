package com.cyclingapp.cyclingservice.repository.model;

import static javax.persistence.FetchType.LAZY;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "divisions")
public class Division implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "division_name", nullable = false)
	private String divisionName;

	@Column(name = "position", nullable = false)
	private Long position;

	@OneToMany(fetch = LAZY, mappedBy = "division", cascade = CascadeType.ALL)
	private List<Team> teams = new ArrayList<Team>();

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

	public Long getPosition() {
		return position;
	}

	public void setPosition(Long position) {
		this.position = position;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	@Override
	public String toString() {
		return "Division [id=" + id + ", divisionName=" + divisionName + ", position=" + position + ", teams=" + teams
				+ "]";
	}

}
