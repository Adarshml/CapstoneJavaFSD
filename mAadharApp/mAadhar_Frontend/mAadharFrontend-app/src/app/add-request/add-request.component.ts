import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms'
import { RequestsService } from '../requests.service';
@Component({
  selector: 'app-add-request',
  templateUrl: './add-request.component.html',
  styleUrls: ['./add-request.component.css']
})
export class AddRequestComponent implements OnInit {

reqRef = new FormGroup({
  // adharid:new FormControl(),
  emailid:new FormControl(),
  name:new FormControl(),
  age:new FormControl(),
  address:new FormControl()
})
storeMsg :string =""
  constructor(public rs:RequestsService) { }

  ngOnInit(): void {
  }
  storeRequest() {
    let request = this.reqRef.value;
    console.log(request);   
    this.rs.storeRequest(request).subscribe({
      next:(result:any)=>this.storeMsg=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })

    this.reqRef.reset();
  }
}
