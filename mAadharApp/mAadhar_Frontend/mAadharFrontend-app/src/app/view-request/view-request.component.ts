import { Component, OnInit } from '@angular/core';
import { Requests } from '../requests';
import { RequestsService } from '../requests.service';

@Component({
  selector: 'app-view-request',
  templateUrl: './view-request.component.html',
  styleUrls: ['./view-request.component.css']
})
export class ViewRequestComponent implements OnInit {
  msg:string=""
  requests:Array<Requests>=[]

  flag:boolean = false;
  adharid:string=""
  emailid:string=""
  name:string=""
  age:number=0
  address:string=""

  constructor(public rs:RequestsService) { }

  ngOnInit(): void {

    this.viewAllRequest();
  }

  viewAllRequest(){
    this.rs.findAllRequest().subscribe({
      next:(result:any)=>this.requests=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
      
    })
    
  }

  denyRequest(adharid:string){
    //console.log(pid)
    this.rs.denyRequest(adharid).subscribe({
      next:(result:any)=>this.msg=result,
      error:(error:any)=>console.log(error),
      complete:()=>{
          this.viewAllRequest();   
      }
    })
  }

  approvereq(request:any){
    this.flag= true;
    this.adharid=request.adharid;
    this.emailid=request.emailid;
    this.name=request.name;
    this.age=request.age;
    this.address=request.address;
}

saveReqtoDB(){
  let request = {adharid:this.adharid,emailid:this.emailid,name:this.name,age:this.age,address:this.address};
  this.rs.approvereq(request).subscribe({
    next:(result:any)=>this.msg=result,
    error:(error:any)=>console.log(error),
    complete:()=>{"completed"   
    }
  })
  this.flag=false;
}

}
