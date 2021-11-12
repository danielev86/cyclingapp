import { Injectable } from '@angular/core';
import { Division } from '../model/Division';
import { Team } from '../model/Team';

@Injectable({
  providedIn: 'root'
})
export class TeamService {

  constructor() { }

  getTeams(teamName:string, countryName:string, division:string): Team[]{
    let teams:Team[] = [
      new Team(1, 'Team Astana', 'Giuseppe Martinelli', 'World Tour', 'Kazakistan'),
      new Team(2, 'AG2R Citroën Team', 'Vincent Lavenu', 'World Tour', 'France'),
      new Team(3, 'Groupama - FDJ', 'Marc Madiot', 'World Tour', 'France')
    ];
    return teams;
  }

  getDivisions():Division[]{
    let divisionList:Division[] = [
      new Division(1,'World Tour'),
      new Division(2,'Professional'),
      new Division(3,'Continental')
    ];
    return divisionList;
  }
}
