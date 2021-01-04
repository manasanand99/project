import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { BuyinsuranceComponent } from './components/buyinsurance/buyinsurance.component';
import { AdminComponent } from './components/admin/admin.component';
import { ClaiminsuranceComponent } from './components/claiminsurance/claiminsurance.component';
import { RenewinsuranceComponent } from './components/renewinsurance/renewinsurance.component';
import { EstimateCalcinsuranceComponent } from './components/estimate-calcinsurance/estimate-calcinsurance.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,
    BuyinsuranceComponent,
    AdminComponent,
    ClaiminsuranceComponent,
    RenewinsuranceComponent,
    EstimateCalcinsuranceComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
