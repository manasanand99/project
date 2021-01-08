import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginValue:boolean=false;
  constructor(private router: Router) {
   }

  ngOnInit(): void {
  }

  loginUser(){
    this.loginValue=true;
    alert("logged in successfully");
    console.log("logged in successfully"+this.loginValue);
  }
}
