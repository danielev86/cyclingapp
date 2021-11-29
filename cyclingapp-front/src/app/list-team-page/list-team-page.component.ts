import { Component, OnInit } from '@angular/core';
import { Country } from '../model/Country';
import { Division } from '../model/Division';
import { Team } from '../model/Team';
import { CountryService} from '../services/country.service';
import { DivisionService } from '../services/division.service';
import { TeamService } from '../services/team.service';
@Component({
  selector: 'app-list-team-page',
  templateUrl: './list-team-page.component.html',
  styleUrls: ['./list-team-page.component.css']
})
export class ListTeamPageComponent implements OnInit {

  countries: Country[] = [];
  divisions: Division[] = [];
  teams: Team[] = [];
  countryNameField:string='';
  teamNameField:string='';
  divisionNameField:string='';


  constructor(private countryService:CountryService, 
    private divisionService:DivisionService,
    private teamService:TeamService) { }

  ngOnInit(): void {
    this.countryService.getAllCountries()
      .subscribe(
        response =>{
          console.log(response)
          this.countries = response;
        }
      )
    this.divisionService.getAllDivisions()
        .subscribe(
          response => {
            console.log(response);
            this.divisions = response;
          }
        )
    this.teams = this.teamService.getTeams(this.teamNameField, this.countryNameField, this.divisionNameField);
  }

  searchTeams(){
    console.log(this.countryNameField);
    console.log(this.teamNameField);
    console.log(this.divisionNameField);
  }

}
