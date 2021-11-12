import { Component, OnInit } from '@angular/core';
import { Team } from '../model/Team';

@Component({
  selector: 'app-list-team',
  templateUrl: './list-team.component.html',
  styleUrls: ['./list-team.component.css']
})
export class ListTeamComponent implements OnInit {

  teams: Team[] = [
    new Team(1, 'Team Astana', 'Giuseppe Martinelli', 'World Tour', 'Kazakistan')

  ];

  constructor() { }

  ngOnInit(): void {
  }

}
