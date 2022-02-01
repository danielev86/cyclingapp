package com.cyclingapp.cyclingservice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cyclingapp.cyclingservice.repository.model.Team;

@Repository
public interface ITeamRepository extends PagingAndSortingRepository<Team, Long> {

}
