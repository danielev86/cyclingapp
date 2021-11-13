import { Component, OnInit } from '@angular/core';
import { Country } from '../model/Country';
import { Division } from '../model/Division';
import { TeamService } from '../services/team.service';
import { CountryService } from '../services/country.service';

@Component({
  selector: 'app-cyclist-list',
  templateUrl: './cyclist-list.component.html',
  styleUrls: ['./cyclist-list.component.css']
})
export class CyclistListComponent implements OnInit {

  firstNameField:string = '';
  lastNameField:string = '';
  countryNameField:string = '';
  divisionField:string = '';
  countries: Country[] = [];
  divisions:Division[] = [];

  constructor(private countryService:CountryService, private teamService:TeamService) { }

  ngOnInit(): void {
    this.countries = this.countryService.getAllCountries();
    this.divisions = this.teamService.getDivisions();
  }

}
