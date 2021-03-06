import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';
import { LoginService } from './login.service';

@Injectable({
  providedIn: 'root'
})
export class RouteGuardService implements CanActivate{

  constructor(private loginService:LoginService, private router:Router) { }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot){
    if (!this.loginService.isLogged()){
      this.router.navigate(['login']);
      return true;
    }else{
      return false;
    }

  }
}
