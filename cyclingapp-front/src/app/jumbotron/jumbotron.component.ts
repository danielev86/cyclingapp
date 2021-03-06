import { Component, Input, OnInit } from '@angular/core';
import { LoginService } from '../services/login.service';

@Component({
  selector: 'app-jumbotron',
  templateUrl: './jumbotron.component.html',
  styleUrls: ['./jumbotron.component.css']
})
export class JumbotronComponent implements OnInit {

  @Input() title:string = '';
  @Input() subtitle:string = '';
  @Input() showLoginBtn:boolean = true;

  constructor(public loginService:LoginService) { }

  ngOnInit(): void {
  }

}
