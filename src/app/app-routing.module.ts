import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminComponent } from './components/admin/admin.component';
import { BuyinsuranceComponent } from './components/buyinsurance/buyinsurance.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';



const routes: Routes = [
   {path: "home", component: HomeComponent},
   {path: "login", component: LoginComponent},
   {path: "buy", component: BuyinsuranceComponent},
   {path: "admin", component: AdminComponent},

{path: "**", redirectTo: "home"},
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
