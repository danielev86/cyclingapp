import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }

  authenticate(username:string, password:string):boolean{
    let isLogged:boolean = false;
    //TODO Authentication
    if (username==='hsimpsons' && password==='homer1986'){
      sessionStorage.setItem('user', username);
      isLogged = true;
    }else{
      isLogged = false;
    }

    return isLogged;
  }

  loggedUser(){
    return sessionStorage.getItem('user') != null
          ? sessionStorage.getItem('user')
          : '';
  }

  isLogged(){
    return sessionStorage.getItem('user') != null ? true : false;
  }
}
