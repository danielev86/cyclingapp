import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }

  authenticate(username:string, password:string){
    if (username==='hsimpsons' && password==='homer1986'){
      sessionStorage.setItem('user', username);
      return true;
    }else{
      return false;
    }
  }

  loggedUser(){
    return sessionStorage.getItem('user') != null
          ? sessionStorage.getItem('user')
          : '';
  }

  isLogged():boolean{
    return sessionStorage.getItem('user') != null ? true : false;
  }

  logout(){
    sessionStorage.clear();
  }
}
