import { Injectable } from '@angular/core';
import { Country } from '../model/Country';

@Injectable({
  providedIn: 'root'
})
export class CountryService {

  constructor() { }

  getAllCountries():Country[]{
    let countries:Country[] =
    [
      new Country(1,'Italy'),
      new Country(2,'France'),
      new Country(3,'Spain')
    ];
    return countries;
  }
}
