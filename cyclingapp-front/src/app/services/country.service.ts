import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Country } from '../model/Country';

@Injectable({
  providedIn: 'root'
})
export class CountryService {

  constructor(private httpClient:HttpClient) { }

  getAllCountries(){
    return this.httpClient.get<Country[]>("http://localhost:8090/api/country/");
  }
}
