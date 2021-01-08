import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-estimate-calcinsurance',
  templateUrl: './estimate-calcinsurance.component.html',
  styleUrls: ['./estimate-calcinsurance.component.css']
})
export class EstimateCalcinsuranceComponent implements OnInit {

  constructor(private router: Router) {​​​​​ }

  ngOnInit(): void {
  }

  cal2wheelerfunc(){
    this.router.navigateByUrl("/cal2wheeler");
  }
  cal4wheelerfunc(){
    this.router.navigateByUrl("/cal4wheeler");
  }
}
