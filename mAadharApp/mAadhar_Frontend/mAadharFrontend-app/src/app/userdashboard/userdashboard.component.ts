import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-userdashboard',
  templateUrl: './userdashboard.component.html',
  styleUrls: ['./userdashboard.component.css']
})
export class UserdashboardComponent implements OnInit {
  user:string ="";
  msg:string=""
  close:string=""
  constructor(private router:Router) { }

  ngOnInit(): void {
    let obj = sessionStorage.getItem("userDetails");
    if(obj!=null){
      this.user=obj;
    }
  }
  logout() {
    sessionStorage.removeItem("userDetails");
    this.router.navigate(["login"]);
  }
  applydup(){
    this.msg="Application for Duplicate adhar of "+this.user+ " requested"
  }

  closeadhar(){
    this.close="Application for Closing adhar of "+this.user+ " requested"
  }

}
