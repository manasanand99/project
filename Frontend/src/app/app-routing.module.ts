import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { BuyinsuranceComponent } from './buyinsurance/buyinsurance.component';
import { Calc2WheelerComponent } from './calc2-wheeler/calc2-wheeler.component';
import { Calc4WheelerComponent } from './calc4-wheeler/calc4-wheeler.component';
import { ClaiminsuranceComponent } from './claiminsurance/claiminsurance.component';
import { EstimateCalcinsuranceComponent } from './estimate-calcinsurance/estimate-calcinsurance.component';
import { HomeComponent } from './home/home.component';
import { Home1Component } from './home1/home1.component';
import { LoginComponent } from './login/login.component';
import { PolicytypeComponent } from './policytype/policytype.component';
import { RegisterComponent } from './register/register.component';
import { RenewinsuranceComponent } from './renewinsurance/renewinsurance.component';
import { VehicleregisterComponent } from './vehicleregister/vehicleregister.component';

const routes: Routes = [
  {path:"home" , component:HomeComponent,
  children : [
    {path:"buy" , component:BuyinsuranceComponent},
    {path:"renew", component:RenewinsuranceComponent},
    {path:"claim", component:ClaiminsuranceComponent},
    {path:"estimateCalc", component:EstimateCalcinsuranceComponent},
]
  },
  {path:"home1", component:Home1Component},
  {path:"buy", component:BuyinsuranceComponent},
  {path:"login" , component:LoginComponent},
  {path:"register", component:RegisterComponent},
  {path:"vehicleregister", component:VehicleregisterComponent},
  {path:"policytype",component:PolicytypeComponent},
  {path:"cal2wheeler", component:Calc2WheelerComponent},
  {path:"cal4wheeler", component:Calc4WheelerComponent},
  {path:"admin" , component:AdminComponent},
  {path: "**", redirectTo: "home1"},

];

@NgModule({
  imports: [RouterModule.forRoot(routes),RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
