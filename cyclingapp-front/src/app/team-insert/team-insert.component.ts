import { Component, OnInit } from '@angular/core';
import { Country } from '../model/Country';
import { Division } from '../model/Division';
import { CountryService } from '../services/country.service';
import { TeamService } from '../services/team.service';

@Component({
  selector: 'app-team-insert',
  templateUrl: './team-insert.component.html',
  styleUrls: ['./team-insert.component.css']
})
export class TeamInsertComponent implements OnInit {
  
  teamNameField:string='';
  teamManagerField:string='';
  uciDivision:string='';
  countryName:string='';
  countries:Country[] = [];
  divisions:Division[] = [];

  constructor(private countryService:CountryService, private teamService:TeamService) { }

  ngOnInit(): void {
    this.countries = this.countryService.getAllCountries();
    this.divisions = this.teamService.getDivisions();
  }

  addTeam(){
    this.teamService.addTeam(this.teamNameField, this.teamManagerField, this.uciDivision, this.countryName);
  }

}
