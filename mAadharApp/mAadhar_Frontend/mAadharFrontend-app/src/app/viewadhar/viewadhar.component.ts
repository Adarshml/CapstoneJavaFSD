import { Component, OnInit } from '@angular/core';
import { Requests } from '../requests';
import { RequestsService } from '../requests.service';

@Component({
  selector: 'app-viewadhar',
  templateUrl: './viewadhar.component.html',
  styleUrls: ['./viewadhar.component.css']
})
export class ViewadharComponent implements OnInit {
  msg:string=""
  requests:Array<Requests>=[]
  myadhar:any
  flag:boolean = false;
  adharid:string=""
  emailid:string=""
  name:string=""
  age:number=0
  address:string=""
  constructor(public rs:RequestsService) { }
  ngOnInit(): void {
    let obj = sessionStorage.getItem("userDetails");
    if(obj!=null){
      this.emailid=obj;
    }
    this.viewmyadhar(this.emailid);
  }

  approvereq(request:any){
    this.flag= true;
    this.adharid=request.adharid;
    this.emailid=request.emailid;
    this.name=request.name;
    this.age=request.age;
    this.address=request.address;
}

  viewmyadhar(emailid:string){
    this.rs.viewmyAdhar(this.emailid).subscribe({
      next:(result:any)=>this.myadhar=JSON.parse(result),
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
      
    })
    
  }

  saveReqtoDB(){
    let request = {adharid:this.adharid,emailid:this.emailid,name:this.name,age:this.age,address:this.address};
    this.rs.updateAdhar(request).subscribe({
      next:(result:any)=>this.msg=result,
      error:(error:any)=>console.log(error),
      complete:()=>{"completed"   
      }
    })
    this.flag=false;
  }

}
