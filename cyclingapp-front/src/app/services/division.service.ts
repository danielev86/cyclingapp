import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Division } from '../model/Division';

@Injectable({
  providedIn: 'root'
})
export class DivisionService {

  constructor(private httpClient: HttpClient) { }

  getAllDivisions(){
    return this.httpClient.get<Division[]>("http://localhost:8090/api/division/");
  }
}
