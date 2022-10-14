import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddRequestComponent } from './add-request/add-request.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { DisplayalladharComponent } from './displayalladhar/displayalladhar.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';
import { ViewRequestComponent } from './view-request/view-request.component';
import { ViewadharComponent } from './viewadhar/viewadhar.component';

const routes: Routes = [
  {path:"login",component:LoginComponent},
  {path:"adminHome",component:AdmindashboardComponent,children:[
    {path:"viewReq",component:ViewRequestComponent},
    {path:"viewall",component:DisplayalladharComponent}
  ]},
  {path:"userHome",component:UserdashboardComponent,children:[
    {path:"storeReq",component:AddRequestComponent},
    {path:"view",component:ViewadharComponent},
  ]},
  {path:"signup",component:SignupComponent},
  {path:"",redirectTo:"login",pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
