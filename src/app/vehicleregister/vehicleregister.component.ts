import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-vehicleregister',
  templateUrl: './vehicleregister.component.html',
  styleUrls: ['./vehicleregister.component.css']
})
export class VehicleregisterComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  policytypefunction(){
    this.router.navigateByUrl("/policytype");
  }

}
