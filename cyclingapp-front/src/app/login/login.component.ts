import { LoginService } from './../services/login.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username:string='';
  password:string='';
  errorMsg:string='';
  isAuthenticated=true;

  constructor(private loginService:LoginService) { }

  ngOnInit(): void {
    
  }

  authenticate(){
    this.isAuthenticated = this.loginService.authenticate(this.username,this.password);
    if (!this.isAuthenticated){
      this.errorMsg = 'Wrong username or password';
    }
    console.log(this.isAuthenticated);
  }

}
