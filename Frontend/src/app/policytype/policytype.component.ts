import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-policytype',
  templateUrl: './policytype.component.html',
  styleUrls: ['./policytype.component.css']
})
export class PolicytypeComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  paymentfunction(){
    alert("Payment successful");
  }
}
