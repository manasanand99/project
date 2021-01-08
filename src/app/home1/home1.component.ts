import { Component, OnInit } from '@angular/core';
 import { Router } from '@angular/router';
 import { LoginComponent } from '../login/login.component';

@Component({
  selector: 'app-home1',
  templateUrl: './home1.component.html',
  styleUrls: ['./home1.component.css']
})
export class Home1Component implements OnInit {

   constructor() { }
//    constructor(private router: Router,
//     private loginComponent:LoginComponent) { }
//  m:boolean=false;
  ngOnInit(): void {
  }

  //  vehiclefun() {
  //    this.m=this.loginComponent.login;
  //    if(this.m==true){
  //    this.router.navigateByUrl("/vehicleregister");
  //    }
  //   else{
  //      this.router.navigateByUrl("/login");
  //    }
  //  }
}
