import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginServiceService } from '../login-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router: Router,private loginservice:LoginServiceService) {
   }

  ngOnInit(): void {
  }

  loginUser(){
    this.loginservice.loginvalue=true;
    alert("logged in successfully");
    console.log("logged in successfully"+ this.loginservice.loginvalue);
  }
}
