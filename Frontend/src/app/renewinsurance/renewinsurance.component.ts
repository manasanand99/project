import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-renewinsurance',
  templateUrl: './renewinsurance.component.html',
  styleUrls: ['./renewinsurance.component.css']
})
export class RenewinsuranceComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  policytypefunc(){
    this.router.navigateByUrl("/policytype");
  }
}
