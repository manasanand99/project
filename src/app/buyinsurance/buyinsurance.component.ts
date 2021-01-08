import { Component, OnInit } from '@angular/core';
import {​​​​​ Router }​​​​​ from '@angular/router';

@Component({
  selector: 'app-buyinsurance',
  templateUrl: './buyinsurance.component.html',
  styleUrls: ['./buyinsurance.component.css']
})
export class BuyinsuranceComponent implements OnInit {

  constructor(private router: Router) {​​​​​ }

  ngOnInit(): void {
  }

   signupfunction() {
     this.router.navigateByUrl("/register");
    
  }
  loginfunction() {
    this.router.navigateByUrl("/vehicleregister");
   
 }
}
