import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginServiceService } from '../login-service.service';
import { LoginComponent } from '../login/login.component';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  m?:boolean;
  constructor(private router: Router,private loginservice1:LoginServiceService) { }
  ngOnInit(): void {
 
  }

  vehiclefun() {
   this.m=this.loginservice1.loginvalue;
    console.log(this.m);
    if(this.m==true){
      console.log(this.m);
        this.router.navigateByUrl("/vehicleregister");
    }
    else{
      this.router.navigateByUrl("/login"); 
    }
      
  }
}
