import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { LoginComponent } from './login/login.component';
import { BuyinsuranceComponent } from './buyinsurance/buyinsurance.component';
import { ClaiminsuranceComponent } from './claiminsurance/claiminsurance.component';
import { EstimateCalcinsuranceComponent } from './estimate-calcinsurance/estimate-calcinsurance.component';
import { RenewinsuranceComponent } from './renewinsurance/renewinsurance.component';
import { AdminComponent } from './admin/admin.component';
import { Home1Component } from './home1/home1.component';
import { RegisterComponent } from './register/register.component';
import { VehicleregisterComponent } from './vehicleregister/vehicleregister.component';
import { PolicytypeComponent } from './policytype/policytype.component';
import { Calc2WheelerComponent } from './calc2-wheeler/calc2-wheeler.component';
import { Calc4WheelerComponent } from './calc4-wheeler/calc4-wheeler.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    FooterComponent,
    LoginComponent,
    BuyinsuranceComponent,
    ClaiminsuranceComponent,
    EstimateCalcinsuranceComponent,
    RenewinsuranceComponent,
    AdminComponent,
    Home1Component,
    RegisterComponent,
    VehicleregisterComponent,
    PolicytypeComponent,
    Calc2WheelerComponent,
    Calc4WheelerComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [LoginComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
