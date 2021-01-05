import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-claiminsurance',
  templateUrl: './claiminsurance.component.html',
  styleUrls: ['./claiminsurance.component.css']
})
export class ClaiminsuranceComponent implements OnInit {

  constructor(private router: Router) {​​​​​ }

  ngOnInit(): void {
  }

  claimfunc(){
    alert("Sent for further verification");
  }
}
